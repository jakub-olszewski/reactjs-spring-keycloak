package com.example.keycloak.springbootkeycloak.controller;

import com.example.keycloak.springbootkeycloak.model.BookEntity;
import com.example.keycloak.springbootkeycloak.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @PostMapping
    //@RolesAllowed({"user", "admin"})
    public BookEntity createBook(@RequestBody BookEntity book){
        return bookService.createBook(book);
    }

    @GetMapping
    //@RolesAllowed("admin")
    public List<BookEntity> getAllBooks(){
        return bookService.getAllBooks();
    }
}
