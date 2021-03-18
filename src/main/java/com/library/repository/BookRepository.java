package com.library.repository;

import java.util.List;

import com.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

  List<Book> findByNameContaining(String name);

  List<Book> findByAuthor_Name(String name);

  List<Book> findByPublisher_Name(String name);
}
