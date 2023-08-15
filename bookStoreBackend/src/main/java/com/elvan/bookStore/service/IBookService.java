package com.elvan.bookStore.service;

import com.elvan.bookStore.model.Book;

import java.util.List;

public interface IBookService
{
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
