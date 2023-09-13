package com.demonstration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demonstration.model.Books;
import com.demonstration.repository.BookRepository;

@Service
public class BooksServiceImplement implements BooksInterface {

	@Autowired
	BookRepository bookRepository;
	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Books getOne(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteBook(long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);

	}

	@Override
	public Books addOneBook(Books books) {
		// TODO Auto-generated method stub
		return bookRepository.save(books);
	}

}
