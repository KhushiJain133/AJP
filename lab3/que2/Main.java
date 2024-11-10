package lab3.que2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your input(Dog or Cat):");
		String input = sc.next();
		
		
		Animal an;
		
		if(input.equalsIgnoreCase("dog")) {
			an = new Dog();
			an.makeSound();
		}
		else if(input.equalsIgnoreCase("cat")) {
			an = new Cat();
			an.makeSound();
		}
		else {
			System.out.println("Enter valid input.");
		}
	}
}
