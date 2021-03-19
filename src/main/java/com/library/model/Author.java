package com.library.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long authorId;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@JsonManagedReference
	@OneToMany(mappedBy = "author", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private List<Book> books;

	public Author() {

	}

	public Author(long authorId, String name, String address) {
		this.authorId = authorId;
		this.name = name;
		this.address = address;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
