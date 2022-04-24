package com.example.booksellerapp.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Purchase {
    private Long id;
    private Long userId;
    private User user;
    private Long bookId;
    private Book book;
    private Double price;
    private LocalDateTime purchaseDateTime;
}
