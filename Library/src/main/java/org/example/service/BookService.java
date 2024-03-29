package org.example.service;

import org.example.dto.Book;
import org.example.entity.BookEntity;

import java.util.List;

public interface BookService {
    void addBook (Book book);

    boolean deleteBook(Long id);

    Book getBookById(Long id);

    List<BookEntity> getBooks();
}
