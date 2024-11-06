package MethodDemo;

public class Bank {
	double amount;
	
	Bank(double amount){
		this.amount = amount;
	}
	
	public void withdraw(double withdrawAmount) {
		String result = amount >= withdrawAmount ? "withdraw Successful" : "Not sufficient amount";
		System.out.println(result);
		
		amount = amount>= withdrawAmount ? amount - withdrawAmount : amount;
	}
	
	public void deposit(double depositeAmount) {
		
		amount += depositeAmount;
		System.out.println(amount);
		
	}
	
	public static void main(String[] args) {
		
		Bank new_account = new Bank(10000);
		
		new_account.withdraw(3000);
		
		new_account.deposit(5000);
		
		
	}
}
