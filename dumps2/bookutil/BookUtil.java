package com.bookutil;

import java.util.Scanner;

import com.book.*;
public class BookUtil {

	public static void main(String[] args) {
		
		BookStore bs=new BookStore();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many books");
		int i=sc.nextInt();
		
		for (int j = 0; j < i; j++) {
			System.out.print("Enter book ID : ");
			String id=sc.next();
			System.out.print("Enter book title : ");
			String title=sc.next();
			System.out.print("Enter book author : ");
			String author=sc.next();
			System.out.print("Enter book category : ");
			String cat=sc.next();
			System.out.print("Enter book price : ");
			float price=sc.nextFloat();
			
			Book b=new Book(id, title, author, cat, price);
			
			bs.addBook(b);
		}
		
		System.out.println("***********************************************");
		
		System.out.print("Enter author name to be searched : ");
		String author=sc.next();
		bs.searchByAuthor(author);

		System.out.println("***********************************************");
		
		System.out.println("Enter book title to be searched : ");
		String title=sc.next();
		bs.searchByTitle(title);
		
		System.out.println("************************************************");
		
		System.out.println("Displaying all the details");
		bs.displayAll();
	}

}
