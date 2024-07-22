package com.zStrong.app.Zstrong.infraestructure.security;

import java.io.IOException;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Security;
import org.springframework.http.HttpHeaders;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.auth0.jwt.interfaces.DecodedJWT;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Collection;

public class JwtTokenValidator extends OncePerRequestFilter{
    
    private JwtUtils jwtUtils;

    public JwtTokenValidator(JwtUtils jwtUtils) {
        this.jwtUtils = jwtUtils;
    }

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,@NonNull FilterChain filterChain)
            throws ServletException, IOException {

                String jwtToken = request.getHeader(HttpHeaders.AUTHORIZATION);

                System.out.println("Is Entering in the Filter");

                if(jwtToken != null){
                    jwtToken = jwtToken.substring(7);
                    DecodedJWT decodedJWT = jwtUtils.validateToken(jwtToken);
                    String userName = jwtUtils.exctractUserName(decodedJWT);
                    String authorities = jwtUtils.getSpecificClaim(decodedJWT, "authorities").asString();

                    Collection<? extends GrantedAuthority> authoritiesList = AuthorityUtils.commaSeparatedStringToAuthorityList(authorities);

                    SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
                    Authentication authentication = new UsernamePasswordAuthenticationToken(userName, null, authoritiesList);
                    securityContext.setAuthentication(authentication);
                    SecurityContextHolder.setContext(securityContext);   

                  
                }

        // TODO Auto-generated method stub
        filterChain.doFilter(request, response);
    }

    

}
