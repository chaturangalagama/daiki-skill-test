package com.library.model;

import javax.persistence.*;

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

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "bookId", nullable = false)
	private Book book;

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

	@Override
	public String toString() {
		return "Publisher{" +
				"publisherId=" + publisherId +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
