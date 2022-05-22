package com.example.booksellerapp.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
    private String id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private Role role;
}
