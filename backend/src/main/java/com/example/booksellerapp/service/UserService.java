package com.example.booksellerapp.service;

import java.util.Optional;

import com.example.booksellerapp.entity.Role;
import com.example.booksellerapp.entity.User;

public interface UserService {
    User saveUser(User user);

    Optional<User> getUserByUserName(String userName);

    void changeRole(String userName, Role role);
}
