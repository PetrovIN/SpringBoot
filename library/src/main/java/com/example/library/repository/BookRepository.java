package com.example.library.repository;

import com.example.library.DAO.Book;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface BookRepository {
    boolean addBook(List<Book> books, Book book);
    boolean deleteBook(List<Book> books, Book book);
    Book getBookById(List<Book> books, int id);
    Book getBookByName(List<Book> books, String name);
    Book getBookByAuthor(List<Book> books, String Author);
    Book getBookByPrice(List<Book> books, int price);
}
