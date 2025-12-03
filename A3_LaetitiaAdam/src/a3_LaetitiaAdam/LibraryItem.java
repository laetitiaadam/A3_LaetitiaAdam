package a3_LaetitiaAdam;

//abstract class with the attributes title, publisher and year
public abstract class LibraryItem {
	private String title;
	private String publisher;
	private int year = 0;
		
		
	//constructor that creates Library Items with the defined attributes
	public LibraryItem(String title, String publisher, int year) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		}

		
	//abstract method that must be implemented by a subclass
	public abstract String displayDetails();

	//getter function to get details
	public String getTitle() {
		return this.title;
		}
	
	//getter function to get details
	public String getPublisher() {
		return this.publisher;
		}
	
	//getter function to get details
	public int getYear() {
		return this.year;
		}
		
	//function to check whether item was published before a certain year
	public boolean isPublishedBefore(int year) {
		return this.year < year;
		}

}
