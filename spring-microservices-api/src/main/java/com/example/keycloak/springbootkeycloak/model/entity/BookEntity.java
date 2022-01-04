package com.example.keycloak.springbootkeycloak.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "book")
public class BookEntity {

    public BookEntity(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Id
    private String id;

    private String title;

    private String author;
}
