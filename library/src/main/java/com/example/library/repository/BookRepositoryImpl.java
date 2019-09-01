package com.example.library.repository;

import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

@Component
public class BookRepositoryImpl implements BookRepository {
    @Override
    public boolean addBook(List<Book> books, Book book) {
        if (book != null && !books.contains(book)) {
            books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(List<Book> books, Book book) {
        if (book != null && books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Book getBookById(List<Book> books, int id) {
        return Arrays.asList(Book).contains(id);
    }

    @Override
    public Book getBookByName(List<Book> books, String name) {
        return Arrays.asList(Book).contains(name);
    }

    @Override
    public Book getBookByAuthor(List<Book> books, String author) {
        return Arrays.asList(Book).contains(author);
    }
}
