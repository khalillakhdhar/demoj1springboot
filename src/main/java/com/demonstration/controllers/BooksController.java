package com.demonstration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demonstration.model.Books;

import jakarta.validation.Valid;

@RestController
@RequestMapping("books")
public class BooksController {
@Autowired
BooksServiceImplement booksServiceImplement;
	
@GetMapping
public List<Books> getAllBooks()
{
	return booksServiceImplement.getAllBooks();
}
@PostMapping()
public Books addOne(@RequestBody @Valid Books books)
{
return booksServiceImplement.addOneBook(books);	
}
@DeleteMapping("/{id}")
public void deleteMe(@PathVariable long id)
{
	
booksServiceImplement.deleteBook(id);
}

}
