package com.extrawest.ocpi221emsp_client.security.filter;

import com.extrawest.ocpi.exception.MethodNotAllowedException;
import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.Endpoint;
import com.extrawest.ocpi.model.dto.VersionDetailsDto;
import com.extrawest.ocpi.model.enums.ModuleID;
import com.extrawest.ocpi.model.enums.VersionNumber;
import com.extrawest.ocpi.service.EMSPVersionService;
import com.extrawest.ocpi221emsp_client.config.PartyConfig;
import com.extrawest.ocpi221emsp_client.security.service.JwtService;
import com.extrawest.ocpi221emsp_client.security.service.TokenService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.ForbiddenException;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.extrawest.ocpi221emsp_client.ExceptionMessage.NOT_IMPLEMENTED_ENDPOINT;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private final JwtService jwtService;
    private final TokenService tokenService;
    private final UserDetailsService userDetailsService;

    private final EMSPVersionService versionService;
    private final PartyConfig partyConfig;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,
                                    @NonNull HttpServletResponse response,
                                    @NonNull FilterChain filterChain) throws ServletException, IOException {

        if (isAdminPanel(request)) {
            filterChain.doFilter(request, response);
            return;
        }

        try {
            String authHeader = request.getHeader("Authorization");
            if (authHeader == null || !authHeader.startsWith("Token ")) {
//                throw new ForbiddenException("Header has no token");
                filterChain.doFilter(request, response);
                return;
            }

            String jwt = extractJwtToken(authHeader);

            //token A
            if (tokenService.isValidTokenA(jwt)) {
                if (!isVersionsRequest(request) && !isCredentialsRequest(request)) {
                    throw new ForbiddenException(String.format("Token A can not be used for %s", request.getServletPath()));
                }
                filterChain.doFilter(request, response);
                if (!isVersionsRequest(request) && isCredentialsRequest(request)) {
                    tokenService.invalidate(jwt);
                }
                return;
            }

            //token B
            if (!tokenService.isRegisteredB(jwt)) {
                throw new ForbiddenException(String.format("Token can not be used for %s", request.getServletPath()));
            }

            if (!isVersionsRequest(request) && isCredentialsRequest(request)) {
                throw new MethodNotAllowedException("Already registered");
            }

            String uuid = jwtService.extractId(jwt);
            if (StringUtils.hasText(uuid) && SecurityContextHolder.getContext().getAuthentication() == null) {

                boolean isValid = tokenService.isRegisteredB(jwt);
                if (!isValid) {
                    throw new ForbiddenException(String.format("Token can not be used for %s", request.getServletPath()));
                }

                UserDetails userDetails = this.userDetailsService.loadUserByUsername(uuid);

                UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authToken);

                // Set the authentication in the SecurityContext
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }

            filterChain.doFilter(request, response);
        } catch (Exception e) {
            response.setHeader("error", e.getMessage());
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            Map<String, String> error = new HashMap<>();
            error.put("error_message", e.getMessage());
            response.setContentType(MimeTypeUtils.APPLICATION_JSON_VALUE);
            new ObjectMapper().writeValue(response.getOutputStream(), error);
        }
    }

    private String extractJwtToken(String authHeader) {
        return authHeader.substring(6);
    }

    private Endpoint getEndpoint(ModuleID identifier) {
        VersionDetailsDto versionDetails = versionService.getVersionDetails(VersionNumber.V_2_2_1);

        return versionDetails.getEndpoints()
                .stream()
                .filter(endpoint -> identifier.equals(endpoint.getIdentifier()))
                .findFirst().orElseThrow(() ->
                        new OcpiResourceNotFoundException(String.format(NOT_IMPLEMENTED_ENDPOINT, identifier)));
    }

    private boolean isCredentialsRequest(HttpServletRequest request) {
        Endpoint endpoint = getEndpoint(ModuleID.CREDENTIALS);
        String requestURI = request.getRequestURI();
        return endpoint.getUrl().contains(requestURI);
    }

    private boolean isVersionsRequest(HttpServletRequest request) {
        String versionsUrl = partyConfig.getVersionsUrl();
        String cleaned = request.getRequestURI().replace("/details", "");
        return versionsUrl.contains(cleaned);
    }

    private boolean isAdminPanel(HttpServletRequest request) {
        String versionUrl = "/admin-panel";
        return request.getRequestURI().contains(versionUrl);
    }
}
