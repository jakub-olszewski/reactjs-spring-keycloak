package com.example.keycloak.springbootkeycloak.service;

import com.example.keycloak.springbootkeycloak.model.BookEntity;
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

	public BookEntity createBook(BookEntity book) {
		return bookRepository.save(book);
	}
}
