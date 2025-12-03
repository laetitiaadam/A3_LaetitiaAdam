package a3_LaetitiaAdam;

//book class extend LibraryItem and gets two more attributes (author and number of pages)
public class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	//constructor for book instance
	//super allows inheriting attributes from Library Item
	//additional two attributes are added
	public Book(String title, String publisher, int year, String author, int numPages) {
		super(title, publisher, year);
		this.author = author;
		this.numPages = numPages;
	}
	
	//display details method is overridden so it return actual attributes of book instance
	@Override
	public String displayDetails() {
		return "Title: " + getTitle() +
				"\nPublisher: " + getPublisher() +
				"\nYear: " + getYear() +
				"\nAuthor: " + author +
				"\nNumber of Pages: " + numPages;
	}

	
}


