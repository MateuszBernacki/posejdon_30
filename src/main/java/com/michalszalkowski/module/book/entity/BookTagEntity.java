package com.michalszalkowski.module.book.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_tag")
@JsonIgnoreProperties("book")
public class BookTagEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "book_id")
	private BookEntity book;

	private String value;

	public BookEntity getBook() {
		return book;
	}

	public BookTagEntity setBook(BookEntity book) {
		this.book = book;
		return this;
	}

	public String getValue() {
		return value;
	}

	public BookTagEntity setValue(String value) {
		this.value = value;
		return this;
	}
}
