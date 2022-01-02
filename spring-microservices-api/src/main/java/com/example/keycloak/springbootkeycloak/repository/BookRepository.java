package com.example.keycloak.springbootkeycloak.repository;

import com.example.keycloak.springbootkeycloak.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer> {
}