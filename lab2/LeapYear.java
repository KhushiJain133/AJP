package lab2;

import java.util.Scanner;

public class LeapYear {

	public boolean checkLeapYear(int num) {
		
		if(num % 400 == 0) {
			return true;
		}
		else if(num % 4 == 0 && num % 100 != 0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LeapYear ly = new LeapYear();
		
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		
		boolean rs = ly.checkLeapYear(year);
		
		if(rs == true) {
			System.out.println("The year is leap year.");
		}
		else {
			System.out.println("The year is not leap year.");
		}
		
		
	}
}
