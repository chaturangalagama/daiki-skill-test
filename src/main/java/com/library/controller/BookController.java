package com.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.model.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(@RequestParam(required = false) String name) {
		try {
			List<Book> books = new ArrayList<Book>();
			if (name == null)
				bookRepository.findAll().forEach(books::add);
			else
				bookRepository.findByNameContaining(name).forEach(books::add);
			if (books.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			return new ResponseEntity<>(books, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/author")
	public ResponseEntity<List<Book>> getAllBooksByAuthor(@RequestParam(required = true) String name) {
		try {
			List<Book> books = new ArrayList<Book>();
			bookRepository.findByAuthor_Name(name).forEach(books::add);
			if (books.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			return new ResponseEntity<>(books, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/publisher")
	public ResponseEntity<List<Book>> getAllBooksByPublisher(@RequestParam(required = true) String name) {
		try {
			List<Book> books = new ArrayList<Book>();
			bookRepository.findByPublisher_Name(name).forEach(books::add);
			if (books.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			return new ResponseEntity<>(books, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/publisher_by_book")
	public ResponseEntity<Publisher> getPublisherByBook(@RequestParam(required = true) String name) {
		try {
			Publisher publisher = bookRepository.findByName(name);
			if (publisher == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(publisher, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
