package com.mitocode.mito_books.service.category;

import java.util.List;

import com.mitocode.mito_books.models.Category;

public interface CategoryService {
    Category save(Category category);
    Category update(Category category, Integer id);
    List<Category> findAll();
    Category findById(int id);
    void deleteById(int id);
    // Category validAndReturn(int idCategory);

}
