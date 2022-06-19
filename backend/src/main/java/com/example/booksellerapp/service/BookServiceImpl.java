package com.example.booksellerapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.booksellerapp.entity.Book;
import com.example.booksellerapp.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        book.setCreatedTime(LocalDateTime.now());
        book.setUpdatedTime(LocalDateTime.now());

        return this.bookRepository.saveBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.getAllBooks();
    }

    @Override
    public void deleteBookById(String bookId) {
        this.bookRepository.deleteBookById(bookId);
    }
}
