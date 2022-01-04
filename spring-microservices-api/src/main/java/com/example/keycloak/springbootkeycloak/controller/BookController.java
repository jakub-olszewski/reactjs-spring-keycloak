package com.example.keycloak.springbootkeycloak.controller;

import com.example.keycloak.springbootkeycloak.model.dto.BookDto;
import com.example.keycloak.springbootkeycloak.model.entity.BookEntity;
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
    public BookEntity createBook(@RequestBody BookDto bookDto){
        return bookService.createBook(bookDto);
    }

    @GetMapping
    //@RolesAllowed("admin")
    public List<BookEntity> getAllBooks(){
        return bookService.getAllBooks();
    }
}
