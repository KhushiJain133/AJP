package MethodDemo;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		int num, power, choice;
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		
		Methods m1 = new Methods();
		System.out.println("Select one option: ");
		System.out.println("1.Check prime number. ");
		System.out.println("2.Check Even Odd. ");
		System.out.println("3.Count Digit. ");
		System.out.println("4.Check Armstrong number. ");
		System.out.println("5.Calculate power. ");
		System.out.println("6.End ");
		
		do{
			
		
		choice = sc.nextInt();
		
		
			switch(choice) {
		
		case 1:
			num = sc.nextInt();
			flag = m1.checkPrime(num);
			if(flag == true) {
				System.out.println("The number is prime number.");
			}
			else {
			System.out.println("The number is not prime number.");
			}
			break;
		case 2:
			num = sc.nextInt();
			flag = m1.checkEvenOdd(num);
			if(flag == true) {
				System.out.println("The number is even number.");
			}
			else {
			System.out.println("The number is odd number.");
			}
			break;
		case 3:
			num = sc.nextInt();
			int count = m1.countDigits(num);
			System.out.println(count);
			break;
		case 4:
			num = sc.nextInt();
			flag = m1.checkArmstrong(num);
			if(flag == true) {
				System.out.println("The number is armstring number.");
			}
			else {
			System.out.println("The number is not armstrong number.");
			}
			break;
		case 5:
			num = sc.nextInt();
			power = sc.nextInt();
			
			int result = m1.calculatePower(num, power);
			System.out.println(result);
			break;
		case 6:
			System.out.println("End");
			break;
			default:
				System.out.println("Enter valid choice.");
				
		}
			}while(choice != 6);
		
	}

}
