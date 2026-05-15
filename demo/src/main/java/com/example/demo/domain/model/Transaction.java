package com.example.demo.domain.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transaction_id;

    @Column
    private String description;

    @Column
    private long amount;

    @Column
    private String type;

    @Column
    private LocalDate date;

    @Column
    private long category_id;

    public Transaction(String description, long amount, String type, LocalDate date, long category_id) {
        this.description = description;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category_id = category_id;
    }

    public long getTransaction_id() {
        return transaction_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }
}
