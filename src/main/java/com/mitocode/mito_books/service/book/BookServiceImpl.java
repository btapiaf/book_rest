package com.mitocode.mito_books.service.book;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mitocode.mito_books.models.Book;
import com.mitocode.mito_books.models.Category;
import com.mitocode.mito_books.repository.book.BookRepo;
import com.mitocode.mito_books.repository.category.CategoryRepo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    


    private final BookRepo repo;
    private final CategoryRepo categoryRepo;

    @Override
    public Book save(Book book) {
        if (book.getCategory() != null && book.getCategory().getIdCategory() != null) {
            Category category = categoryRepo.findById(book.getCategory().getIdCategory())
                    .orElseThrow(() -> new RuntimeException("Category not found with id: " + book.getCategory().getIdCategory()));
            book.setCategory(category);
        }
        return repo.save(book);
    }

    @Override
    public Book update(Book book, Integer idBook) {
        book.setIdBook(idBook);
        if (book.getCategory() != null && book.getCategory().getIdCategory() != null) {
            Category category = categoryRepo.findById(book.getCategory().getIdCategory())
                    .orElseThrow(() -> new RuntimeException("Category not found with id: " + book.getCategory().getIdCategory()));
            book.setCategory(category);
        }
        return repo.save(book);
    }

    @Override
    public List<Book> findAll() {
        return repo.findAll();
    }

    @Override
    public Book findById(int idBook) {
        return repo.findById(idBook).orElse(new Book(999, "NOT FOUND", new Category( 999, "NOT FOUND"), false));
    }

    @Override
    public void deleteById(int idBook) {
        repo.deleteById(idBook);
    }


}
