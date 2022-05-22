package com.example.booksellerapp.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Book {
    private String id;
    private String name;
    private String description;
    private Double price;
    private LocalDateTime createTime;
}
