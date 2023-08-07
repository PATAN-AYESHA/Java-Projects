package com.bookapp.client;

import java.util.ArrayList;
import java.util.List;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

public class Client {

public static void main(String[] args) {
	IBookService bookService = new BookServiceImpl();
	List<Book> books = new ArrayList<>();
	books = bookService.getAll();
	System.out.println(books);
	try {
		books = bookService.getByAuthorContains("Ben John");
	} catch (BookNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(books);
	try {
		books = bookService.getByCategory("Tech");
	} catch (BookNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(books);
	try {
		books = bookService.getByAuthorContainsAndCategory("Richad", "Drama");
	} catch (BookNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(books);
	
	
	
	
}
}
