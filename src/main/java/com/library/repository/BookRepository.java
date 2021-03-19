package com.library.repository;

import java.util.List;

import com.library.model.Book;
import com.library.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface BookRepository extends JpaRepository<Book, Long> {

  List<Book> findByNameContaining(String name);

  List<Book> findByAuthor_Name(String name);

  List<Book> findByPublisher_Name(String name);

  @Query(value = "select p from Publisher p where p.publisherId in (select b.publisher.publisherId from Book b where b.name = :name)")
  Publisher findByName(@Param("name") String name);

}
