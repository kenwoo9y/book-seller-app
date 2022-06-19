package com.example.booksellerapp.repository;

import java.util.List;

import com.example.booksellerapp.entity.Book;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BookRepository {
    public Book saveBook(Book book);

    public List<Book> getAllBooks();

    public void deleteBookById(String bookId);
}
