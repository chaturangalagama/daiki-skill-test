package com.library.model;

import javax.persistence.*;

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

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "bookId", nullable = false)
	private Book book;

	@Override
	public String toString() {
		return "Author{" +
				"authorId=" + authorId +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
