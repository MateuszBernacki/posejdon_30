package com.michalszalkowski.module.book.dto;

public class BookDetailsDto {

	private String lang;
	private String publisher;

	public String getLang() {
		return lang;
	}

	public BookDetailsDto setLang(String lang) {
		this.lang = lang;
		return this;
	}

	public String getPublisher() {
		return publisher;
	}

	public BookDetailsDto setPublisher(String publisher) {
		this.publisher = publisher;
		return this;
	}
}
