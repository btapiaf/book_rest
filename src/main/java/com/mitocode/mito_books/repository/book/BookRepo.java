package com.mitocode.mito_books.repository.book;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.mito_books.models.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

    //Book getBookById(int idBook);
    
}
