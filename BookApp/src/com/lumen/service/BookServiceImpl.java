package com.lumen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bookapp.util.BookDetails;
import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book> books = BookDetails.BookList();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = getAll();
		ArrayList<Book> getbyauthorcontains = new ArrayList<>();
		for(Book book: books) {
			if(book.getAuthor().equals(author)) {
				getbyauthorcontains.add(book);
			}
		}
		return getbyauthorcontains;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = getAll();
		ArrayList<Book> getbycategory = new ArrayList<>();
		for(Book book: books) {
			if(book.getCategory().equals(category)) {
				getbycategory.add(book);
			}
		}
		return getbycategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = getAll();
		ArrayList<Book> getbypricelessthan = new ArrayList<>();
		for(Book book: books) {
			if(book.getPrice()>=price) {
				getbypricelessthan.add(book);
			}
		}
		return getbypricelessthan;
	}
	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = getAll();
		ArrayList<Book> getbyauthorcontainsandcategory = new ArrayList<>();
		for(Book book: books) {
			if(book.getAuthor().equals(author)) {
				if(book.getCategory().equals(category))
					getbyauthorcontainsandcategory.add(book);
			}
		}
		return getbyauthorcontainsandcategory;
	}

	public List<Book> getById(int bookId) throws BookNotFoundException {
		List<Book> books = getAll();
		ArrayList<Book> getbyid = new ArrayList<>();
		for(Book book: books) {
			if(book.getBookId().equals(bookId)) {
				getbyid.add(book);
			}
		}
		return getbyid;
	}

}
