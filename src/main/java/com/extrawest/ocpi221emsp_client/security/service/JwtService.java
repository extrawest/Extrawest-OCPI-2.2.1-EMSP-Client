package com.extrawest.ocpi221emsp_client.security.service;

import com.extrawest.ocpi221emsp_client.model.Party;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

@Service
public class JwtService {
    @Value("${jwt.secret.key}")
    private String secretKey;
//    @Value("${jwt.live.millis}")
//    private long jwtLiveMillis;

    private static final String TYPE_CLAIM_NAME = "Type";
    private static final String TOKEN_A = "TOKEN_A";
    private static final String TOKEN_B = "TOKEN_B";

    public String extractPartyName(String jwtToken) {
        return extractClaim(jwtToken, Claims::getSubject);
    }

    public String extractUUID(String jwtToken) {
        return extractClaim(jwtToken, Claims::getSubject);
    }

    public String extractTokenType(String jwtToken) {
        return extractClaim(jwtToken, claims -> claims.get(TYPE_CLAIM_NAME, String.class));
    }

    public <T> T extractClaim(String jwtToken, Function<Claims, T> claimsResolver) {
        Claims claims = extractAllClaims(jwtToken);
        return claimsResolver.apply(claims);
    }


    public String generateTokenA(String partyId, String countryCode) {
        return Jwts.builder()
                .setClaims(Map.of(TYPE_CLAIM_NAME, TOKEN_A))
                .setSubject(Party.createPartyName(partyId, countryCode))
                .setIssuedAt(new Date())
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public String generateTokenA(LocalDateTime localDateTime, UUID uuid) {
        Map<String, Object> extraClaims = Map.of(
                TYPE_CLAIM_NAME, TOKEN_A,
                "timestamp", String.valueOf(localDateTime.toEpochSecond(ZoneOffset.UTC))
        );
        return generateToken(extraClaims, uuid);
    }

    public String generateTokenB(LocalDateTime localDateTime, UUID uuid) {
        Map<String, Object> extraClaims = Map.of(
                TYPE_CLAIM_NAME, TOKEN_B,
                "timestamp", String.valueOf(localDateTime.toEpochSecond(ZoneOffset.UTC))
        );
        return generateToken(extraClaims, uuid);
    }

    public String generateToken(Map<String, Object> extraClaims, UUID uuid) {
        return Jwts.builder()
                .setClaims(extraClaims)
                .setSubject(uuid.toString())
                .setIssuedAt(new Date())
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public boolean isTokenValid(String jwtToken, UserDetails userDetails) {
        String partyNameFromToken = extractPartyName(jwtToken);
        return partyNameFromToken.equals(userDetails.getUsername());
    }

    private Claims extractAllClaims(String jwtToken) {
        JwtParser jwtParser = Jwts.parserBuilder()
                .setSigningKey(getSigningKey())
                .build();

        return jwtParser.parseClaimsJws(jwtToken).getBody();
    }

    private Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public boolean isTokenA(String jwtToken) {
        String tokenType = extractTokenType(jwtToken);
        if (!StringUtils.hasText(tokenType)) {
            return true;
        }
        return tokenType.equals(TOKEN_A);
    }

}
