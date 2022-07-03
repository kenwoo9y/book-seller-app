package com.example.booksellerapp.security.jwt;

import javax.servlet.http.HttpServletRequest;

import com.example.booksellerapp.security.UserPrincipal;

import org.springframework.security.core.Authentication;

public interface JwtProvider {
    String generateToken(UserPrincipal userPrincipal);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
