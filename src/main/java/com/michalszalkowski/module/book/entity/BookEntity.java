package com.michalszalkowski.module.book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "book")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Author for book is required 1")
	@NotEmpty(message = "Author for book is required 2")
	@Size(min = 3, max = 50, message = "Author should has 3 up to 5")
	private String author;

	@NotNull(message = "Title for book is required 1")
	@NotEmpty(message = "Title for book is required 2")
	private String title;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "details_id", referencedColumnName = "id")
	private BookDetailsEntity details;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private Set<BookTagEntity> tags;

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

	public BookDetailsEntity getDetails() {
		return details;
	}

	public BookEntity setDetails(BookDetailsEntity details) {
		this.details = details;
		return this;
	}

	public Set<BookTagEntity> getTags() {
		return tags;
	}

	public BookEntity setTags(Set<BookTagEntity> tags) {
		this.tags = tags;
		return this;
	}
}
