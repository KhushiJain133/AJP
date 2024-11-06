package pack2;

import java.util.Scanner;

public class CheckAge 
{
	public void showMessage(int age) throws MyException
	{
		if(age>=18)
			System.out.println("You are eligible to vote!!!");
		else
			throw new MyException("You are underage to Vote!!\nCome back when you are 18 years old!!!");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		CheckAge cc=new CheckAge();
		
		System.out.println("Enter age : ");
		try {
			cc.showMessage(sc.nextInt());
		} catch (MyException e) {
			
			e.printStackTrace();
		}
		
	}
}