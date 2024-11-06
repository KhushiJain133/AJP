package operators;

import java.util.Scanner;

public class MaximunNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max  = (num1>num2) ? num1 : num2;
		
		System.out.println("The greater number is "+ max);
	}

}
