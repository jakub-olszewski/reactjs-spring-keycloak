package com.example.keycloak.springbootkeycloak.repository;

import com.example.keycloak.springbootkeycloak.model.entity.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<BookEntity,String> {

}
