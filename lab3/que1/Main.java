package lab3.que1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calling using base class instance.");
		
		HillStation hs;
		
		hs = new Manali();
		hs.location();
		hs.famousFor();
		
		hs = new Mussoorie();
		hs.location();
		hs.famousFor();
		
		hs = new Gulmarg();
		hs.location();
		hs.famousFor();
		
		System.out.println("Calling using individual calss instances.");
		
		Manali ms = new Manali();
		ms.location();
		ms.famousFor();
		
		Mussoorie mu = new Mussoorie();
		mu.location();
		ms.famousFor();
		
		Gulmarg gs = new Gulmarg();
		gs.location();
		gs.famousFor();
	}
}
