package com.michalszalkowski.module.book.mapper;

import com.michalszalkowski.module.book.entity.BookTagEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BooksTagsMapper {

	public static String map(BookTagEntity tag) {
		return tag.getValue();
	}

	public static Set<String> map(Set<BookTagEntity> tags) {
		if (tags == null) {
			return Set.of();
		}
		return tags
				.stream()
				.map(BooksTagsMapper::map)
				.collect(Collectors.toSet());
	}

	public static String mapAsString(Set<BookTagEntity> tags) {
		return map(tags)
				.stream()
				.collect(Collectors.joining(","));
	}

}
