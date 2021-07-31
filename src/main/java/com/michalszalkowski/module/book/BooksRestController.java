package com.michalszalkowski.module.book;

import com.michalszalkowski.module.book.entity.BookDetailsEntity;
import com.michalszalkowski.module.book.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksRestController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/api/init")
	public List<BookEntity> init() {

		bookRepository.saveAndFlush(new BookEntity()
				.setAuthor("michal")
				.setTitle("java")
				.setDetails(new BookDetailsEntity().setIsbn("1111").setLang("pl").setPublisher("spring")));

		bookRepository.saveAndFlush(new BookEntity()
				.setAuthor("marta")
				.setTitle("krafting")
				.setDetails(new BookDetailsEntity().setIsbn("2222").setLang("en").setPublisher("helion")));

		return bookRepository.findAll();
	}

	@GetMapping("/api/book")
	public List<BookEntity> getBooks() {
		return bookRepository.findAll();
	}

	@GetMapping("/api/book/{id}")
	public BookEntity getBook(@PathVariable Long id) {
		return bookRepository.findOneById(id);
	}

	@PostMapping("/api/book")
	public BookEntity newBook(@RequestBody @Valid BookEntity booksEntity) {
		return bookRepository.saveAndFlush(booksEntity);
	}

	@PutMapping("/api/book/{id}")
	public BookEntity updateBooks(@PathVariable Long id,
	                               @RequestBody BookEntity booksEntity) {
		return bookRepository.saveAndFlush(booksEntity.setId(id));
	}

	@DeleteMapping("/api/book/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookRepository.deleteById(id);
	}

}
