package com.prowings.Composition;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Library {
	private final List<Book> books;

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getTotalBooksInLibrary() {
		return books;
	}

	public static void main(String[] args) {
		Book b1 = new Book("Effective Java", "joshoua Bloch");
		Book b2 = new Book("Thinking in Java", "Bruce Ekel");
		Book b3 = new Book("java : The Complete Reference", "Herbert Schildt");

		List<Book> books = new ArrayList<Book>();

		books.add(b1);
		books.add(b2);
		books.add(b3);

		Library library = new Library(books);

		List<Book> bks = library.getTotalBooksInLibrary();

		for (Book bk : bks) {
			System.out.println("Title : " + bk.title + " and " + "Author : " + bk.author);
		}

	}
}

class Book {
	public String title;
	public String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
}
