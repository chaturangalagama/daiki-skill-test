package com.library.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookId;

	@Column(name = "name")
	private String name;

	@OneToOne(fetch = FetchType.LAZY,
			cascade =  CascadeType.ALL,
			mappedBy = "book")
	private Publisher publisher;

	@OneToOne(fetch = FetchType.LAZY,
			cascade =  CascadeType.ALL,
			mappedBy = "book")
	private Author author;

	@Column(name = "price")
	private Double price;

//	@Column(name = "published")
//	private boolean published;

	public Book() {

	}

	public Book(long bookId, String name, Publisher publisher, Author author, Double price) {
		this.bookId = bookId;
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bookId=" + bookId +
				", name='" + name + '\'' +
				", publisher='" + publisher + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				'}';
	}

	//	public Book(String title, String description, boolean published) {
//		this.title = title;
//		this.description = description;
//		this.published = published;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public boolean isPublished() {
//		return published;
//	}
//
//	public void setPublished(boolean isPublished) {
//		this.published = isPublished;
//	}
//
//	@Override
//	public String toString() {
//		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
//	}

}
