package com.example.booksellerapp.service;

import java.time.LocalDateTime;
import java.util.Optional;

import com.example.booksellerapp.entity.Role;
import com.example.booksellerapp.entity.User;
import com.example.booksellerapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreatedTime(LocalDateTime.now());
        user.setUpdatedTime(LocalDateTime.now());

        return this.userRepository.saveUser(user);
    }

    @Override
    public Optional<User> getUserByUserName(String userName) {
        return this.userRepository.getUserByUserName(userName);
    }

    @Override
    @Transactional
    public void changeRole(String userName, Role role) {
        this.userRepository.changeRole(userName, role);
    }
}
