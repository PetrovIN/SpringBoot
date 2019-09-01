package com.example.library.DAO;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Catalog {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
