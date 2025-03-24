package com.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Author
{
	String firstName;
	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	String lastName;
}

class Book
{
	String title;
	Author author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	public Book(String title, Author author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
}

class BookImplementation {
    

	public BookImplementation() {
		// TODO Auto-generated constructor stub
	}

	public List<String> firstNameOfAuthors(Author... authors) {
		
		return Stream.of(authors) 
        .map(a -> a.getFirstName()) 
        .toList();
    }

    public  List<String> titlesOf(Book... books) {
    	return Stream.of(books) 
                .map(Book::getTitle) 
                .toList();
    }
}

public class AuthorProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author joshuaBloch = new Author("Joshua", "Bloch");
		Author brianGoetz = new Author("Brian", "Goetz");
		Author barryBurd = new Author("Barry", "Burd");

		Book Java1 = new Book("Effective Java", joshuaBloch);
		Book Java2 = new Book("Java Concurrency In Practice", brianGoetz);
		Book Java3 = new Book("Java For Dummies", barryBurd);
		
		BookImplementation b=new BookImplementation();
		BookImplementation b1=new BookImplementation();
		
		System.out.println(b.titlesOf(Java1,Java2,Java3));
		System.out.println(b1.firstNameOfAuthors(joshuaBloch,brianGoetz,barryBurd));


	}

}
