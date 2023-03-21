package com.prowings.classObject;

import java.util.HashMap;

public class Books {

	private int booknumber;
	private String bookName;
	private double price;
	private String author;

	public Books(int booknumber, String bookName, double price, String author) {
		super();
		this.booknumber = booknumber;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public int getBookNumber() {
		return booknumber;
	}

	public String getBookName() {
		return bookName;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public static Books findBooksQuickly(HashMap<Integer, Books> booksMap, int BookNumber) {
		if (booksMap.containsKey(BookNumber)) {
			return booksMap.get(BookNumber);
		} else {
			return null;
		}
	}

}
