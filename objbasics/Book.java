package com.lumen.objbasics;

public class Book {
	
	String title;
	String author;
	double price;
	String category;
	public Book(String title, String author, double price, String category) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	void getDetails() {
		System.out.println("Title:"+ this.title);
		System.out.println("Author:"+this.author);
		System.out.println("Price:"+this.price);
		System.out.println("Category:"+this.category);
	}
	
	void checkBookType() {
		if(this.price> 500) {
			System.out.println("Premium books");
		}
		else {
			System.out.println("Standard books");
		}
	}
	

}
