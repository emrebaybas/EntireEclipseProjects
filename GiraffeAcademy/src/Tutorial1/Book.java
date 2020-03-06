package Tutorial1;

public class Book {

	String title;
	String author;
	int pages;
	String language;

	// this underneath is our constructor method
	// now we will be able to create a book in one line 
	//check book2 class to see  how we do it
	public Book(String title, String author, int pages, String language) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.language = language;
	}
}
