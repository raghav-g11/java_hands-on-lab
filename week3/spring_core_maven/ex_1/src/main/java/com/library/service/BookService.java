package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository = new BookRepository();

    public void addBook(String bookName) {
        bookRepository.saveBook(bookName);
    }
}
