package com.sda.spring.demo;

import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.repository.AuthorRepository;
import com.sda.spring.demo.repository.BookRepository;
import com.sda.spring.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	public BookRepository bookRepository;
	@Autowired
	public AuthorRepository authorRepository;
	@Autowired
	public CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book = new Book("Przygoda", "Jan Kowalski");
		bookRepository.save(book);
	}
}
