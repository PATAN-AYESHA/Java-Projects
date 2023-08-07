package com.bookstreamapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.bookstreamapp.exceptions.BookNotFoundException;
import com.bookstreamapp.model.Book;
import com.bookstreamapp.util.BooksDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book> books = BooksDetails.BookList();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> getbyAuthorContains= books.stream()
				.filter(book1-> book1.getAuthor().equals(author))
				.collect(Collectors.toList());
		return getbyAuthorContains;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> getbyCategory= books.stream()
				.filter(book1-> book1.getCategory().equals(category))
				.collect(Collectors.toList());
		return (List<Book>) getbyCategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> getbyPriceLessThan = books.stream()
				.filter(book1->book1.getPrice()>=price)
				.collect(Collectors.toList());
		return getbyPriceLessThan;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> getbyAuthorContainsAndCategory= books.stream()
				.filter(book1-> book1.getAuthor().equals(author))
				.filter(book1-> book1.getCategory().equals(category))
				.collect(Collectors.toList());
		return getbyAuthorContainsAndCategory;
	}

	@Override
	public List<Book> getById(int bookId) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> getbyId = books.stream()
				.filter(book->book.getBookId().equals(bookId))
				.collect(Collectors.toList());
		return getbyId;
	}

}
