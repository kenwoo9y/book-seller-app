package com.example.booksellerapp.security.jwt;

import javax.servlet.http.HttpServletRequest;

import com.example.booksellerapp.security.UserPrincipal;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtProviderImpl implements JwtProvider {

    @Override
    public String generateToken(UserPrincipal userPrincipal) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Authentication getAuthentication(HttpServletRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isTokenValid(HttpServletRequest request) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
