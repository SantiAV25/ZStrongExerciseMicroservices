package com.zStrong.app.Zstrong.infraestructure.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import java.util.Map;



@Component
public class JwtUtils {

    @Value("${secutiry.jwt.key.private}")
    private String privateKey;

    @Value("${secutiry.jwt.user.generator}")
    private String userGenerator;

    public DecodedJWT validateToken(String token) {
        try{
 
         Algorithm algorithm = Algorithm.HMAC256(this.privateKey);
         JWTVerifier verifier = JWT.require(algorithm).withIssuer(this.userGenerator).build();
 
         DecodedJWT decodedJWT = verifier.verify(token);
 
         return decodedJWT;
 
        }catch(JWTVerificationException exception){
            throw new JWTVerificationException("Token is invalid, no Authorazied");
        }
     }

     public String exctractUserName(DecodedJWT decodedJWT) {
        return decodedJWT.getSubject().toString();
    }

    public Claim getSpecificClaim(DecodedJWT decodedJWT, String claimName) {
        return decodedJWT.getClaim(claimName);
    }

    public Map<String, Claim> getAllClaims(DecodedJWT decodedJWT) {
        return decodedJWT.getClaims();
    }   

    
}
