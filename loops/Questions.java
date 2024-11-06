package loops;

import java.util.Scanner;
public class Questions {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	// Q1 wap to print even number from the given range.
	
	/*System.out.println("Enter the start range:");
	int start_range = sc.nextInt();
	
	System.out.println("Enter the end range:");
	int end_range = sc.nextInt();
	
	for(int i=start_range ; i <= end_range ; i++) {
		if(i % 2 == 0) {
			System.out.println(i);
		}
	}
	
	
	// Q2 wap to print even numbers(input number of elements i.e. first n number of even number).
	System.out.println("Enter the number of even numbers: ");
	int num = sc.nextInt();
	for(int i= 1, x=1 ; i <= num ; x++) {
			
			if(x % 2 == 0) {
				System.out.println(x);
				i++;
		}
			
	}*/
	
	// Q3 wap to print all ascii character from 0 to 127.
	
	/*for(int i=0 ; i<= 127; i++) {
		System.out.println(i + " " + (char)i);
	}*/
	
	// Q4 wap to calculate the number of digits in a number.
	
	/*System.out.println("Enter a number:");
	int number = sc.nextInt();
	int count =0;
	
	while(number !=0) {
		int result = number % 10;
		number = number / 10;
		count ++;
	}
	
	System.out.println(count);
	*/
	
	// Q5 wap to calculate the power of a variable if the number and exponent value is given by the user.
	
	/*System.out.println("Enter the base number:");
	int base = sc.nextInt();
	
	System.out.println("Enter the exponent value:");
	int exponent = sc.nextInt();
	
	int result = 1;
	
	for(int i = 1; i<= exponent ;i++) {
		result = result * base ;
	}
	
	System.out.println(result);
	*/
	
	// Q6 wap to reverse digits of a number like 1243 will become 3421
	
	/*System.out.println("Enter a number:");
	
	int number = sc.nextInt();
	
	int reverse = 0;
	
	for(int i = number ; i>0; ) {
		int rem = i%10;
		reverse = reverse * 10 + rem;
		i = i/10;
	}
	
	System.out.println(reverse);
	*/
	
	//Q6 wap to check whether a number is palindrome or not.
	
	
	/*System.out.println("Enter a number:");
	
	int number = sc.nextInt();
	
	int reverse = 0;
	
	for(int i = number ; i>0; ) {
		int rem = i%10;
		reverse = reverse * 10 + rem;
		i = i/10;
	}
	
	if(reverse == number) {
		System.out.println("the number is palindrome.");
	}
	
	else {
		System.out.println("The number is not palindrome");
	}*/
	
	//Q7 wap to check whether a number is armstrong or not.
	
	System.out.println("Enter a number:");
	int number = sc.nextInt();
	
	
	
	int len = String.valueOf(number).length();
	int result =0;
	while(number !=0) {
		int remainder = number %10;
		int tem = 1;
		for(int i=0 ; i< len ; i++) {
			tem *= remainder;
		}
		result += tem;
		number /= 10;
		
	}
	
	if(result == number) {
		System.out.println("The number is Armstrong number.");
	}
	else {
		System.out.println("The number is not armstrong number.");
	}
	
	// Q12 wap to check the password
	
	/*int small=0, caps=0, num=0, sp=0;
	
	System.out.println("Enter Password");
	
	String pass_wrd = sc.nextLine();
	
	if(pass_wrd.length() >= 6) {
		
		System.out.println("The password length is correct.");
		
		char ch = pass_wrd.charAt(i);
		
		for(int i=0; i<pass_wrd.length(); i++) {
			if(ch>= 'A' && ch <='Z') caps++;
			else if (ch>='a' && ch<='z') small++;
			else if (ch>='0' && ch<='9') num++;
			else sp++;
		}
		
		if(caps > 0 && small >0 && num > 0 && sp > 0) {
			System.out.println("The password strenght is good");
		}
		else {
			System.out.println("Password should contain at least 1 small character, 1 capital character, 1 number and 1 special character");
		}
		
		
	}
	else {
		System.out.println("The password should contain at least 6 ");
	}
	*/
}
}