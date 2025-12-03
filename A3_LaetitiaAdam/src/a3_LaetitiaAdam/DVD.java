package a3_LaetitiaAdam;

//DVD class inherits from LibraryItem and has two more attributes
public class DVD extends LibraryItem{
		private int duration;
		private String director;
		
		//constructor for DVD instance
		//super allows inheriting attributes from Library Item
		//duration and director are added
		public DVD(String title, String publisher, int year, int duration, String director) {
			super(title, publisher, year);
			this.duration = duration;
			this.director = director;
		}
		
		//DisplayDetails method is overridden so it actually returns the attributes of DVD
		@Override
		public String displayDetails() {
			return "Title: " + getTitle() +
					"\nPublisher: " + getPublisher() +
					"\nYear: " + getYear() +
					"\nDuration: " + duration +
					"\nDirector: " + director;
		}

		
	}




