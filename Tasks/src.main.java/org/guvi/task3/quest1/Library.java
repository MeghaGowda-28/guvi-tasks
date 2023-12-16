package org.guvi.task3.quest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Library {
	
	public Library(List<Book> books) {
		this.books = books;
	}
	
	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void displayBooks(Library library){
		if(library.getBooks().isEmpty()){
			System.out.println("\nThere are no Books in Library to Display right now, we are coming up with new collection soon.");
		} else {
			System.out.println("These are the Books present in Library: \n");
			library.getBooks().stream().forEach(obj -> {
				System.out.println(obj.getBookId()+", "+obj.getTitle()+", "+obj.getAuthor());
			});
		}
		System.out.println("\nThank you for visiting our Library.. Have a Great Day :)");
	}
	
	public void addBook(Scanner input, Library library, ArrayList<Book> booksList){
		System.out.println("Please enter BookId: ");
		int bookId = input.nextInt();
		input.nextLine();
		System.out.println("Please enter Title: ");
		String title = input.nextLine();
		System.out.println("Please enter Author: ");
		String author = input.nextLine();
		
		Book book = new Book(bookId, title, author, true);
		
		if(library.getBooks().isEmpty()){
			booksList.add(book);	
		} else {
			library.getBooks().add(book);
		}
		System.out.println("\nHurray!!!! Book Added Successfully\n");
		System.out.println("Books in Library after Addition of new book: ");
		library.getBooks().stream().forEach(obj -> {
			System.out.println(obj.getBookId()+", "+obj.getTitle()+", "+obj.getAuthor());
		});
	}
	
	public void removeBook(Scanner input, Library library){
		if(library.getBooks().isEmpty()){
			System.out.println("There are no books in Library to perform deletion");
		} else {
			System.out.println("Please enter BookId: ");
			int bookId = input.nextInt();
			library.getBooks().removeIf(obj -> obj.getBookId() == bookId);
			System.out.println("Yo!!! Book Deletion Successfull\n");
			System.out.println("Remaining Books in Library: ");
			library.getBooks().stream().forEach(obj -> {
				System.out.println(obj.getBookId()+", "+obj.getTitle()+", "+obj.getAuthor());
			});
		}
	}
	
	public void searchBook(Scanner input, Library library){
		if(library.getBooks().isEmpty()){
			System.out.println("There are no books in Library to Search");
		} else {
			System.out.println("Please enter BookId: ");
			int bookId = input.nextInt();
			Predicate<Book> condition = obj -> obj.getBookId() == bookId;
			for(Book obj : library.getBooks()){
				if(condition.test(obj)){
					if(obj.isAvailable()){
						System.out.println("Good Newsss :) The Book searched for is available: ");
						System.out.println(obj.getBookId()+", "+obj.getTitle()+", "+obj.getAuthor());	
					}else{
						System.out.println("The Book searched for is Not Available, Visit Next Time.. ThankYou");
					}
				}
			}
		}
	}

}
