package com.example.demo.controller;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.Category;
import com.example.demo.domain.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryRepository repository;

    public CategoryController(CategoryRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Category create(@RequestBody @NonNull Category category) {
        return repository.save(category);
    }

    @GetMapping
    public List<Category> findAll() {
        return repository.findAll();
    }
}
