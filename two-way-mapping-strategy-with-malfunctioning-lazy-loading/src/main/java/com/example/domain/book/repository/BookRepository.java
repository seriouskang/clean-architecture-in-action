package com.example.domain.book.repository;

import com.example.domain.book.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Optional<Book> findById(Long id);
    List<Book> findAll();
}
