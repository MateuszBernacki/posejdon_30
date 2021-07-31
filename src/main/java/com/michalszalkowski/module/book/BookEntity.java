package com.michalszalkowski.module.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "book")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Author for book is required 1")
	@NotEmpty(message = "Author for book is required 2")
	@Size(min = 3, max = 5, message = "Author should has 3 up to 5")
	private String author;

	@NotNull(message = "Title for book is required 1")
	@NotEmpty(message = "Title for book is required 2")
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
