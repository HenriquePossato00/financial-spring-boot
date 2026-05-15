package com.example.demo.controller;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.Transaction;
import com.example.demo.service.TransactionService;


@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Transaction> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Transaction create(@RequestBody @NonNull Transaction transaction) {
        return service.create(transaction);
    }

    
}
