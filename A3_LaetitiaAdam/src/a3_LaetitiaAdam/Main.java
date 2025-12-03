package a3_LaetitiaAdam;

public class Main {
	public static void main(String[] args) {
		
		//construct books
		Book b1 = new Book("Lord of the Rings", "George Allen & Unwin", 1954, "J. R. R. Tolkien", 1178);
		System.out.println(b1.displayDetails());
		System.out.println("-------------------------");
		
		Book b2 = new Book("22 Bahnen", "DuMont Buchverlag GmbH & Co. KG", 2023, "Caroline Wahl", 208);
		System.out.println(b2.displayDetails());
		System.out.println("-------------------------");
		
		//construct Magazines
		Magazine m1 = new Magazine("Runner´s World", "Hearst", 2025, 12, "December");
		System.out.println(m1.displayDetails());
		System.out.println("-------------------------");
				
		Magazine m2 = new Magazine("Bergauf", "ÖAV - Österreichischer Alpenverein", 2025, 4, "October-December");
		System.out.println(m2.displayDetails());
		System.out.println("-------------------------");
		
		//construct DVDS
		DVD d1 = new DVD("Ballon", "herbX Film, Studiocanal GmbH und SevenPictures Film GmbH", 2018, 125, "Michael Herbig");
		System.out.println(d1.displayDetails());
		System.out.println("-------------------------");
						
		DVD d2 = new DVD("Schindler's List", "Amblin Entertainment", 1993, 195, "Steven Spielberg");
		System.out.println(d2.displayDetails());
		System.out.println("-------------------------");
	}
}
