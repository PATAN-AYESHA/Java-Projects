package com.bookstreamapp.client;

import java.util.ArrayList;
import java.util.List;

import com.bookstreamapp.exceptions.BookNotFoundException;
import com.bookstreamapp.model.Book;
import com.bookstreamapp.service.BookServiceImpl;

public class BookMain {

	public static void main(String[] args) {
		BookServiceImpl bookService = new BookServiceImpl();
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
