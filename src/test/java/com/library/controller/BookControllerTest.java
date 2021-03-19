package com.library.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.library.model.Author;
import com.library.model.Book;
import com.library.model.Publisher;
import com.library.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@ExtendWith(MockitoExtension.class)
class BookControllerTest {

    @InjectMocks
    BookController bookController;

    @Mock
    BookRepository bookRepository;

//    @Test
//    public void testFindAll()
//    {
//        // given
//        List<Book> books = new ArrayList<Book>();
//        Author author = new Author(1, "harsha", "wattala");
//        Publisher publisher = new Publisher(1, "sarasavi", "nugegoda");
//        Book book1 = new Book(1, "lokesh", publisher, author, 22.0);
//        books.addAll((Arrays.asList(book1)));
//
//        when(bookRepository.findAll()).thenReturn(books);
//
//        // when
//        ResponseEntity<List<Book>> result1 = bookController.getAllBooks(null);
//
//        // then
//        assertThat(result1.getStatusCodeValue()).isLessThanOrEqualTo(204);
//
//    }
//
//
//
//    @Test
//    public void testFindAllWithBookName()
//    {
//        // given
//        List<Book> books = new ArrayList<Book>();
//        Author author = new Author(1, "harsha", "wattala");
//        Publisher publisher = new Publisher(1, "sarasavi", "nugegoda");
//        Book book1 = new Book(1, "lokesh", publisher, author, 22.0);
//        books.addAll((Arrays.asList(book1)));
//
//        // when
//        ResponseEntity<List<Book>> result2 = bookController.getAllBooks("lokesh");
//
//        // then
//        assertThat(result2.getStatusCodeValue()).isLessThanOrEqualTo(204);
//    }
//
//    @Test
//    public void testFindAllWithAuthorName()
//    {
//        // given
//        List<Book> books = new ArrayList<Book>();
//        Author author = new Author(1, "harsha", "wattala");
//        Publisher publisher = new Publisher(1, "sarasavi", "nugegoda");
//        Book book1 = new Book(1, "lokesh", publisher, author, 22.0);
//        books.addAll((Arrays.asList(book1)));
//
//        // when
//        ResponseEntity<List<Book>> result2 = bookController.getAllBooksByAuthor("harsha");
//
//        // then
//        assertThat(result2.getStatusCodeValue()).isLessThanOrEqualTo(204);
//    }
//
//    @Test
//    public void testFindAllWithPublisherName()
//    {
//        // given
//        List<Book> books = new ArrayList<Book>();
//        Author author = new Author(1, "harsha", "wattala");
//        Publisher publisher = new Publisher(1, "sarasavi", "nugegoda");
//        Book book1 = new Book(1, "lokesh", publisher, author, 22.0);
//        books.addAll((Arrays.asList(book1)));
//
//        // when
//        ResponseEntity<List<Book>> result2 = bookController.getAllBooksByAuthor("sarasavi");
//
//        // then
//        assertThat(result2.getStatusCodeValue()).isLessThanOrEqualTo(204);
//    }
}
