//1.Design a class Book in com.model package containing following private members: 
//	bookID	text
//title	text
//author	text
//category	text
//price	float
//
//Define public Parameterized constructor to initialize Book object. 
//
//
//2.Design a class called BookStore in com.service package which contains 
//an appropriate collection object to store Book   Instances.
//
//Implement the below operations.
//
//1.	addBook(Book b)
//To add a new Book object into the collection.
//
//2.	searchByTitle(String title)
//Search a book based on title and if found, display the details
//
//3.	searchByAuthor(String author)
//Search a book based on author and if found, display the details
//
//4.	displayAll()
//Print the details of all the books
//
//
//3.Create a class BookUtil in package com.bookutil which has the main method.
//
//•	Instantiate the BookStore class
//•	Read data from user for 3 Book objects.
//Perform the below validations
//
//•	Category must be “Science”, “Fiction”, “Technology” or “Others”
//•	Price cannot be negative
//•	bookID must start with ‘B’ and must be of length 4 characters
//
//If any of the validations fail, throw an user defined exception InvalidBookException
//with appropriate message(As specified in validations above).Declare this exception in com.exception package.
//
//4.Implement below  Operations:
//
//•	For Valid Book,Call the addBook method to add the book objects into the collection
//•	Search the books by title and author
//•	Display all the book details

package com.collections;
import java.util.*;
class BookStore
{
	List<Book> b=new ArrayList();
	void addBook(Book b)
	{
		this.b.add(b);
	}
	
	void searchByTitle(String s)
	{
		int flag=0;
		for(Book item:b)
		{
			if(item.getTitle()==s)
			{
				System.out.println("Found");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Not found");
		}
		
		
	}
	
	void searchByAuthor(String s)
	{
		int flag=0;
		for(Book item:b)
		{
			if(item.getAuthor()==s)
			{
				System.out.println("Found");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Not found");
		}
	}
	
	void DisplayAll()
	{
		for(Book item:b)
		{
			System.out.println(item);
		}
	}
}

class InvalidBookException extends RuntimeException {
    public InvalidBookException(String e) {
        super(e);
    }
}
class Book
{
	String bookID,title,author,category;
	float price;
	public Book(String bookID, String title, String author, String category, float price) throws InvalidBookException
	{
		
		Set<String> s=new TreeSet();
		s.add("Science");
		s.add("Fiction");
		s.add("Technology");
		s.add("Others");
		//System.out.println(s);
		
		if (bookID.charAt(0) != 'B' || bookID.length() != 4)

		{
			throw new InvalidBookException("ID must start with B and must be of length 4 characters");
		}
		
		if(price<0)
		{
			throw new InvalidBookException("Price can't be -ve");
		}
		if(!s.contains(category))
		{
			throw new InvalidBookException("Category must be Science, Fiction,Technology or Others");
		}
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		
		
	}
	
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}	
}


public class ExcepAndCollectionProb {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try {
		//Book b1=new Book("A123","One Indian Girl","Chetan Bhagat","Fiction",500.00f);
		//Book b2=new Book("B333","Song of ice and fire","George RR Martin","Science",-1000.00f);
		Book b3=new Book("B123","Programming","Sugat Bhagat","Horror",1500.00f);
		BookStore bs=new BookStore();
		//bs.addBook(b1);
		//bs.addBook(b2);
		bs.addBook(b3);
	//bs.DisplayAll();
//		bs.searchByTitle("One Indian Girl");
//		bs.searchByAuthor("Sugat Bhagat");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}


