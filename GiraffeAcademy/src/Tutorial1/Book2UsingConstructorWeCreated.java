package Tutorial1;

public class Book2UsingConstructorWeCreated {

	public static void main(String[] args) {
		
		Book book1=new Book  ("Harry Potter", "JK Rowling", 500, "English");
		Book book2=new Book  ("The 4 hour workweek", "Tim Ferriss", 300, "English");
		
		System.out.println(book1.title);
		System.out.println(book1.author);
		
		System.out.println(book2.pages);
		System.out.println(book2.language);
	}
}
