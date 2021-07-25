package com.michalszalkowski.module.book;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String author;

	private String title;

	public Long getId() {
		return id;
	}

	public BookEntity setId(Long id) {
		this.id = id;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public BookEntity setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public BookEntity setTitle(String title) {
		this.title = title;
		return this;
	}
}
