package lab3.que3;

public class VaccinationSuccessful extends Vaccine{

	public VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
	}

	public void boosterDose(boolean secondDoseTaken) {
		
		if(secondDoseTaken) {
			System.out.println("Booster dose taken.");
		}
		else {
			System.out.println("User is not eligible for the booster dose. Complete the second dose first.");
		}
		
	}
}
