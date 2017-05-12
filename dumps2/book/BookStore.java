package com.book;

import java.util.ArrayList;

public class BookStore {
	
	ArrayList<Book> barr=new ArrayList<Book>();
	
	public void addBook(Book b) {
		barr.add(b);
				
	}
	
	public void searchByTitle(String title) {
		
		for (int i = 0; i < barr.size(); i++) {
			if(barr.get(i).getTitle().equals(title)){
				System.out.println(barr.get(i));
			}
		}
		
	}
	
	public void searchByAuthor(String author) {
		
		for (int i = 0; i < barr.size(); i++) {
			if(barr.get(i).getAuthor().equals(author)){
				System.out.println(barr.get(i));
			}
		}
	}
	
	public void displayAll() {
		for (int i = 0; i < barr.size(); i++) {
			System.out.println(barr.get(i));
		}
		
	}

}
