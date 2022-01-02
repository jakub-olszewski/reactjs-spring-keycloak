package com.example.keycloak.springbootkeycloak.controller;

import com.example.keycloak.springbootkeycloak.model.BookEntity;
import com.example.keycloak.springbootkeycloak.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    //@RolesAllowed({"user", "admin"})
    public ResponseEntity<BookEntity> save(@RequestBody BookEntity book){
        return ResponseEntity.ok(bookRepository.save(book));
    }

    @GetMapping
    //@RolesAllowed("admin")
    public ResponseEntity<List<BookEntity>> findAll(){
        return ResponseEntity.ok(bookRepository.findAll());
    }
}
