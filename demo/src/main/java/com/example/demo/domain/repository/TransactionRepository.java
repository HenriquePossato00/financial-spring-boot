package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}
