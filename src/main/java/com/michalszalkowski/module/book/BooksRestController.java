package com.michalszalkowski.module.book;

import com.michalszalkowski.module.book.dto.BookDto;
import com.michalszalkowski.module.book.entity.BookEntity;
import com.michalszalkowski.module.book.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksRestController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/api/book")
	public List<BookDto> getBooks() {
		List<BookEntity> books = bookRepository.findAll();
		return BookMapper.map(books);
	}

	@GetMapping("/api/book/{id}")
	public BookDto getBook(@PathVariable Long id) {
		BookEntity book = bookRepository.findOneById(id);
		return BookMapper.map(book);
	}

	@PostMapping("/api/book")
	public BookDto newBook(@RequestBody @Valid BookEntity booksEntity) {
		BookEntity book = bookRepository.saveAndFlush(booksEntity);
		return BookMapper.map(book);
	}

	@PutMapping("/api/book/{id}")
	public BookDto updateBooks(@PathVariable Long id,
	                           @RequestBody BookEntity booksEntity) {
		BookEntity book = bookRepository.saveAndFlush(booksEntity.setId(id));
		return BookMapper.map(book);
	}

	@DeleteMapping("/api/book/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookRepository.deleteById(id);
	}

}
