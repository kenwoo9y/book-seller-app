package com.example.booksellerapp.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Purchase {
    private String id;
    private String userId;
    private User user;
    private String bookId;
    private Book book;
    private Double price;
    private LocalDateTime purchaseDateTime;
}
