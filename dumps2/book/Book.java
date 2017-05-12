package com.book;

public class Book {
	
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	
	public Book(String bookId, String title, String author, String category,
			float price) {
		if((category.equals("Science")||category.equals("Fiction")||category.equals("Technology")||category.equals("Others"))&&(price > 0)&&((bookId.charAt(0)=='B') && (bookId.length()==4))){
			
					this.bookId = bookId;
					this.title = title;
					this.author = author;
					this.category = category;
					this.price = price;
				
		}
		
		else {
			try {
				throw new InvalidBookException("Invalid book");
			} catch (InvalidBookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public Book() {
		super();
	}


	public String getBookId() {
		return bookId;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public String getCategory() {
		return category;
	}


	public float getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author="
				+ author + ", category=" + category + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
