package com.example.booksellerapp.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String id;
    private String name;
    private String description;
    private Double price;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
