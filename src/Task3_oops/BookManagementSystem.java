package Task3_oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
	int bookID;
    String title;
	String author;
	boolean isAvailable;
	
	public Book(int bookID, String title, String author) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	public int getBookId() {
		return bookID;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
}

class Library{
	
//	public Library(int bookID, String title, String author) {
//		super(bookID, title, author);
//	}
	List<Book> books = new ArrayList<>(); //user-defined datatype(arr) to store Book objects in Library
//	public Library() {
//		this.books = new Book[5];
//	}
	
	public void addBooks(Book bookObj) {
		books.add(bookObj);
//		return books;
	}
	
	public List<Book> removeBooks(int bookID) {
		for(Book b: books) {
			if(b.getIsAvailable() && b.getBookId() == bookID) {
				books.remove(b);
				System.out.println("Removed successfully");
				break;
			}
		}
		return books;
	}
	
	public void searchBooks(int bookID) {
		for(Book b: books) {
			if(b.getBookId() == bookID) {
				if(b.getIsAvailable()) {
					System.out.println(b.getBookId() + " "+ b.getTitle() + " " + b.getAuthor() + " Available - " + b.getIsAvailable());
				}
				else {
					System.out.println("Searched book " +bookID + " is not available");
				}
			}
			
		}
	}
	
	public void displayBooks(){
		for(Book b: books) {
			System.out.println(b.getBookId() + " "+ b.getTitle() + " " + b.getAuthor());
//			System.out.println(b);
		}
	}
}

public class BookManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book to add info(id, title author) ");
		int bookID = sc.nextInt();
		String title = sc.nextLine();
		sc.nextLine();
		String author = sc.nextLine();
		
		Book bookObj = new Book(bookID, title, author);
		Library LibObj = new Library();
		LibObj.addBooks(bookObj); // or LibObj.addBooks(new Book(bookID, title, author))
		LibObj.displayBooks();
		LibObj.searchBooks(bookID);
		LibObj.removeBooks(bookID);
	}

}
