package com.example.library.DAO;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private int id;
    private int bookId;
    private int readerId;
    private int amount;

    public Order(int id, int bookId, int readerId, int amount) {
        this.id = id;
        this.bookId = bookId;
        this.readerId = readerId;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
