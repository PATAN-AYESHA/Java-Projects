package com.lumen.service;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import java.util.List;
import java.util.Optional;
public interface IBookService {
	
	List<Book> getAll();
	List<Book> getByAuthorContains(String author)throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
	List<Book> getById(int bookId) throws BookNotFoundException;
	
}
