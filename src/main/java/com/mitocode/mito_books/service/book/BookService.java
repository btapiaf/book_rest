package com.mitocode.mito_books.service.book;

import java.util.List;

import com.mitocode.mito_books.models.Book;

public interface BookService {
    Book save(Book book);
    Book update(Book book, Integer idBook);
    List<Book> findAll();
    Book findById(int idBook);
    void deleteById(int idBook);
    // Book validAndReturn(int idBook);

}
