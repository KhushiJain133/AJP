package lab3.que3;

public abstract class Vaccine {
	
	int age;
	String nationality;

	public Vaccine(int age, String nationality) {
		this.age = age;
		this.nationality = nationality;
	}
	
	public void firstDose() {
		if(nationality.equalsIgnoreCase("Indian") && age >=18) {
			System.out.println("First dose taken. Please pay 250rs.");
		}
		else {
			System.out.println("User is not eligible for the first dose.");
		}
	}
	
	public void secondDose(boolean firstDoseTaken) {
		if(firstDoseTaken) {
			System.out.println("Second dose taken.");
		}
		else {
			System.out.println("User is not eligible for the second dose. Complete the first dose first.");
		}
	}
	
	public abstract void boosterDose(boolean secondDoseTaken);
}
