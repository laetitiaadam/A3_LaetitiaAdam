package a3_LaetitiaAdam;

public class DVD extends LibraryItem{
		private int duration;
		private String director;
		
	//constructor that adds additional attributes to DVD class
		public DVD(String title, String publisher, int year, int duration, String director) {
			super(title, publisher, year);
			this.duration = duration;
			this.director = director;
		}
		
		@Override
		public String displayDetails() {
			return "Title: " + getTitle() +
					"\nPublisher: " + getPublisher() +
					"\nYear: " + getYear() +
					"\nDuration: " + duration +
					"\nDirector: " + director;
		}

		
	}




