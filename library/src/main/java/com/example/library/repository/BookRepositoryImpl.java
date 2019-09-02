package com.example.library.repository;

import com.example.library.DAO.Book;
import org.springframework.stereotype.Component;

//import java.awt.print.Book;
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
        return null;
    }

    @Override
    public Book getBookByName(List<Book> books, String name) {
        return null;
    }

    @Override
    public Book getBookByAuthor(List<Book> books, String Author) {
        return null;
    }

    @Override
    public Book getBookByPrice(List<Book> books, int price) {
        return null;
    }
}
