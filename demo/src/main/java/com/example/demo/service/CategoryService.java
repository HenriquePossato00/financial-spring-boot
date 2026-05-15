package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.model.Category;

import com.example.demo.domain.repository.CategoryRepository;

public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category create(Category category) {
        if (category.getName() == null) {
            throw new RuntimeException("Name must not be NULL");
        }

        return repository.save(category);
    }

    public List<Category> findAll() {
        return repository.findAll();
    }
}
