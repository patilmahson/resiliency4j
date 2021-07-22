package com.mahesh.librarymanangement.service;

import java.util.List;

import com.mahesh.librarymanangement.model.Book;

public interface LibrarymanagementService {

    String addBook(Book book);
    String addBookwithRateLimit(Book book);
    List<Book> getBookList();
    List<Book> getBookListBulkhead();
}