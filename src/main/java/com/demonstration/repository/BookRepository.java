package com.demonstration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.demonstration.model.Books;

public interface BookRepository extends JpaRepository<Books, Long> {

}
