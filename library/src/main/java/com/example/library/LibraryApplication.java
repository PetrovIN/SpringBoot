package com.example.library;

import com.example.library.DAO.Book;
import com.example.library.DAO.Reader;
import com.example.library.repository.BookRepository;
import com.example.library.repository.BookRepositoryImpl;
import com.example.library.repository.ReaderRepository;
import com.example.library.repository.ReaderRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LibraryApplication.class, args);
		List<Reader> readers = new ArrayList<>();
		List<Book> books = new ArrayList<>();

		Book book = ctx.getBean(Book.class);
		book.setName("War and peace");
		System.out.println(book.getName());

		BookRepository bookRepository = ctx.getBean(BookRepositoryImpl.class);
		System.out.println(bookRepository.addBook(books, book));

		Reader reader = ctx.getBean(Reader.class);
		reader.setName("Ilya");
		System.out.println(reader.getName());

		ReaderRepository readerRepository = ctx.getBean(ReaderRepositoryImpl.class);
		System.out.println(readerRepository.addReader(readers, reader));
	}

}
