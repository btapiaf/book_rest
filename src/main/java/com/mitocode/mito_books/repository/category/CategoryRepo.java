package com.mitocode.mito_books.repository.category;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mitocode.mito_books.models.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

    //Book getBookById(int idBook);
    
}
