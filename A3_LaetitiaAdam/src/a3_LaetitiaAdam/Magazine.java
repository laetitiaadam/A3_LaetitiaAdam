package a3_LaetitiaAdam;

public class Magazine extends LibraryItem{
		private int issueNumber;
		private String month;
		
	//constructor that adds additional attributes to Magazine class
		public Magazine(String title, String publisher, int year, int issueNumber, String month) {
			super(title, publisher, year);
			this.issueNumber = issueNumber;
			this.month = month;
		}
		
		@Override
		public String displayDetails() {
			return "Title: " + getTitle() +
					"\nPublisher: " + getPublisher() +
					"\nYear: " + getYear() +
					"\nIssue Number: " + issueNumber +
					"\nMonth: " + month;
		}

		
}



