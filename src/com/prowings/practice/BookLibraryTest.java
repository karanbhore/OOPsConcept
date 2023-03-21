package com.prowings.practice;

import java.util.ArrayList;
import java.util.List;

public class BookLibraryTest {
	public static void main(String[] args) {
		Book b1 = new Book("Effective Java", "Joshua Blouch");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("the Complete Reference", "Herbert Schildt");

		List<Book> books = new ArrayList<Book>();
		books.add(b3);
		books.add(b2);
		books.add(b1);
		Library library = new Library(books);

		List<Book> bks = library.getBooks();

		for (Book bk : bks) {
			System.out.println("Title : " + bk.title + "\n Author : " + bk.author);
			System.out.println();
		}

	}

}
