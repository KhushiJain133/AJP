package lab3.que3;

import java.util.Scanner;

public class Vaccination {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		VaccinationSuccessful user = new VaccinationSuccessful(20, "Indian");
		
		user.firstDose();
		
		boolean firstDoseTaken = false;
		
		System.out.println("First dose taken(y or n)");
		String input = sc.next();
		if(input.equalsIgnoreCase("y")) {
			firstDoseTaken = true; 
		}
		
		
		
		user.secondDose(firstDoseTaken);
		
		boolean secondDoseTaken = false;
		
		System.out.println("Second dose taken(y or n)");
		input = sc.next();
		if(input.equalsIgnoreCase("y")) {
			secondDoseTaken = true; 
		}
		
		user.boosterDose(secondDoseTaken);
	}
}
