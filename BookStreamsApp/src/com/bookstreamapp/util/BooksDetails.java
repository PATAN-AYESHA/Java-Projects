package com.bookstreamapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookstreamapp.model.Book;

public class BooksDetails {

	public static List<Book> BookList(){
		return Arrays.asList(
				new Book("Java in Action","john David","Tech",1,90.90),
				new Book("5 am club","Robin sharma","Selfhelp",2,300.68),
				new Book("HTML for Dummies","Ben john","Tech",3,1900.45),
				new Book("Secret Seven","Enid Ben","Fiction",4,700.8),
				new Book("Seven habits","Richad","Drama",5,600.98)
				);		
	}
}
