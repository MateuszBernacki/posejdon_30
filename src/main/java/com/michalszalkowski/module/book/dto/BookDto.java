package com.michalszalkowski.module.book.dto;

import java.util.Set;

public class BookDto {

	private Long id;
	private String author;
	private String title;
	private BookDetailsDto details;
	private Set<String> tags;
	private String tag;

	public Long getId() {
		return id;
	}

	public BookDto setId(Long id) {
		this.id = id;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public BookDto setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public BookDto setTitle(String title) {
		this.title = title;
		return this;
	}

	public BookDetailsDto getDetails() {
		return details;
	}

	public BookDto setDetails(BookDetailsDto details) {
		this.details = details;
		return this;
	}

	public Set<String> getTags() {
		return tags;
	}

	public BookDto setTags(Set<String> tags) {
		this.tags = tags;
		return this;
	}

	public String getTag() {
		return tag;
	}

	public BookDto setTag(String tag) {
		this.tag = tag;
		return this;
	}
}
