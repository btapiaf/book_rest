package com.mitocode.mito_books.service.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mitocode.mito_books.models.Category;
import com.mitocode.mito_books.repository.category.CategoryRepo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    


    private final CategoryRepo repo;

    @Override
    public Category save(Category category) {
        return repo.save(category);
    }

    @Override
    public Category update(Category category, Integer id) {
        category.setIdCategory(id);
        return repo.save(category);
    }

    @Override
    public List<Category> findAll() {
        return repo.findAll();
    }

    @Override
    public Category findById(int id) {
        return repo.findById(id).orElse(new Category(999, "No Category"));
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }


}
