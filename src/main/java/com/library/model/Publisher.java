package com.library.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "publishers")
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long publisherId;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

//	@OneToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "bookId", nullable = false)
//	private Book book;

//	@OneToMany(mappedBy = "bookId", fetch = FetchType.LAZY,
//			cascade = CascadeType.ALL)
//	private Set<Book> books;
	@JsonManagedReference
	@OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
//	@JoinColumn(name = "bookId", referencedColumnName = "bookId")
	private List<Book> books;

	public Publisher() {

	}

	public Publisher(long publisherId, String name, String address) {
		this.publisherId = publisherId;
		this.name = name;
		this.address = address;
	}

	public long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(long publisherId) {
		this.publisherId = publisherId;
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

//	@Override
//	public String toString() {
//		return "Publisher{" +
//				"publisherId=" + publisherId +
//				", name='" + name + '\'' +
//				", address='" + address + '\'' +
//				'}';
//	}
}
