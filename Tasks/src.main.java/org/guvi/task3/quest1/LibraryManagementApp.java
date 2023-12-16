package org.guvi.task3.quest1;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementApp {
	
	public static void main(String[] args) {
		
		ArrayList<Book> booksList = new ArrayList<>();
		booksList.add(new Book(12, "Java Fundamentals", "Author1", true));
		booksList.add(new Book(134, "OOPS Pioneer", "Author2", true));
		booksList.add(new Book(78, "SQL expert", "Author3", true));
		booksList.add(new Book(28, "Frontend Basics", "Author4", true));
		booksList.add(new Book(822, "Core Java", "Author5", true));
		booksList.add(new Book(16, "Core and Advanced Java PRO", "Author7", false));
		
		Library library = new Library(booksList);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please do input any one number accordingly: ");
		System.out.println("1 to View available books");
		System.out.println("2 to Add Book");
		System.out.println("3 to Remove book");
		System.out.println("4 to search for a book");
		int enteredValue = input.nextInt();
		
		if(enteredValue == 1){
			library.displayBooks(library);
			
		} else if(enteredValue == 2){
			library.addBook(input, library, booksList);
			
		} else if(enteredValue == 3){
			library.removeBook(input, library);
			
		} else if(enteredValue == 4) {
			library.searchBook(input, library);
		}
		
		input.close();
	}

}
