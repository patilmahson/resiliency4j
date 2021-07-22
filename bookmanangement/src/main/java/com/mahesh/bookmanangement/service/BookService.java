package com.mahesh.bookmanangement.service;

import java.util.List;

import com.mahesh.bookmanangement.model.Book;

public interface BookService {


    public String addBook(Book book);

    public List<Book> retrieveBookList();
}
