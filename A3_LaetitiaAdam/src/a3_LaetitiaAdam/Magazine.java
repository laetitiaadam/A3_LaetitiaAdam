package a3_LaetitiaAdam;

//Magazine class extends Library Item and has two more attributes
public class Magazine extends LibraryItem{
		private int issueNumber;
		private String month;
		
		//constructor for Magazine instance
		//super allows inhering of attributes from Library Item
		//issue Number and month are added
		public Magazine(String title, String publisher, int year, int issueNumber, String month) {
			super(title, publisher, year);
			this.issueNumber = issueNumber;
			this.month = month;
		}
		
		//Display Details method is overridden so it return actual attributes of magazine instance
		@Override
		public String displayDetails() {
			return "Title: " + getTitle() +
					"\nPublisher: " + getPublisher() +
					"\nYear: " + getYear() +
					"\nIssue Number: " + issueNumber +
					"\nMonth: " + month;
		}

		
}



