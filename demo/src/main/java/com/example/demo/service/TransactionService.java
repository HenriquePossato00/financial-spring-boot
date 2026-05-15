package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.model.Transaction;
import com.example.demo.domain.repository.TransactionRepository;

public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction create(Transaction transaction) {
        if (transaction.getAmount() <= 0) {
            throw new RuntimeException("Amount must be greater than zero");
        }

        return repository.save(transaction);
    }
    
    public List<Transaction> findAll() {
        return repository.findAll();
    }
}
