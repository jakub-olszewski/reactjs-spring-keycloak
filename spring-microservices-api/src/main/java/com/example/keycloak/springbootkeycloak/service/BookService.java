package com.example.keycloak.springbootkeycloak.service;

import com.example.keycloak.springbootkeycloak.model.dto.BookDto;
import com.example.keycloak.springbootkeycloak.model.entity.BookEntity;
import com.example.keycloak.springbootkeycloak.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookRepository bookRepository;

	public List<BookEntity> getAllBooks() {
		return bookRepository.findAll();
	}

	public BookEntity createBook(BookDto bookDto) {
		BookEntity book = new BookEntity(bookDto.title(), bookDto.author());
		return bookRepository.save(book);
	}
}
