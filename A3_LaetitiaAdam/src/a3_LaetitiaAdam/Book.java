package a3_LaetitiaAdam;

//book class is inheriting from LibraryItem and gets two more attributes (author and number of pages)
public class Book extends LibraryItem{
	private String author;
	private int numPages;
	
//constructor that adds additional attributes to Book class
	public Book(String title, String publisher, int year, String author, int numPages) {
		super(title, publisher, year);
		this.author = author;
		this.numPages = numPages;
	}
	
	@Override
	public String displayDetails() {
		return "Title: " + getTitle() +
				"\nPublisher: " + getPublisher() +
				"\nYear: " + getYear() +
				"\nAuthor: " + author +
				"\nNumber of Pages: " + numPages;
	}

	
}


