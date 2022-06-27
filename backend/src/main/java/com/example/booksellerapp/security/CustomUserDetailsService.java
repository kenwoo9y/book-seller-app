package com.example.booksellerapp.security;

import java.util.Set;

import com.example.booksellerapp.entity.User;
import com.example.booksellerapp.service.UserService;
import com.example.booksellerapp.utils.SecurityUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.getUserByUserName(userName).orElseThrow(() -> new UsernameNotFoundException(userName));

        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertTAuthority(user.getRole().name()));

        return UserPrincipal.builder()
                            .user(user)
                            .id(user.getId())
                            .userName(userName)
                            .password(user.getPassword())
                            .authorities(authorities)
                            .build();
    }
    
}
