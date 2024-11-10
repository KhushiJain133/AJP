package lab2;

import java.util.Scanner;

public class StrongNum {
	
	public int factorial(int num) {
		
		int fac = 1;
		
		for(int i=1; i<=num; i++) {
			fac *= i; 
		}
		
		return fac;
	}
	
	
	
	public boolean checkStrong(int n) {
		StrongNum am=new StrongNum();
		
		int sum=0;
		
		for(int num = n; num>0; num/=10)
		{
			int rem= num%10;
			int r = am.factorial(rem);
			sum += r;
			

		}
		if(n == sum) {
			return true;
		}
		else {
			return false;
		}
	}
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StrongNum sn = new StrongNum();
		System.out.println("Enter a number you want check: ");
		int num = sc.nextInt();
		
		boolean rs = sn.checkStrong(num);
		
		if(rs == true) {System.out.println("The number is Strong number.");}
		else {System.out.println("The number is not Strong number.");}
	}

}
