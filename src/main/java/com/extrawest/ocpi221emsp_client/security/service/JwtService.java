package com.extrawest.ocpi221emsp_client.security.service;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
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

    public String extractId(String jwtToken) {
        return extractClaim(jwtToken, Claims::getSubject);
    }

    public String extractTokenType(String jwtToken) {
        return extractClaim(jwtToken, claims -> claims.get(TYPE_CLAIM_NAME, String.class));
    }

    public <T> T extractClaim(String jwtToken, Function<Claims, T> claimsResolver) {
        Claims claims = extractAllClaims(jwtToken);
        return claimsResolver.apply(claims);
    }

    public String generateTokenA(String uuid) {
        Map<String, Object> extraClaims = Map.of(TYPE_CLAIM_NAME, TOKEN_A);
        return generateToken(extraClaims, uuid);
    }

    public String generateTokenB(String uuid) {
        Map<String, Object> extraClaims = Map.of(TYPE_CLAIM_NAME, TOKEN_B);
        return generateToken(extraClaims, uuid);
    }

    public String generateToken(Map<String, Object> extraClaims, String uuid) {
        return Jwts.builder()
                .setClaims(extraClaims)
                .setSubject(uuid)
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
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
