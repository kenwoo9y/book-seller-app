package com.example.booksellerapp.service;

import java.util.List;

import com.example.booksellerapp.entity.Book;

public interface BookService {
    Book saveBook(Book book);

    List<Book> getAllBooks();

    void deleteBookById(String bookId);
}
