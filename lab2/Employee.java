package lab2;

import java.util.Scanner;

public class Employee extends User{
	
	Employee(int id, String name){
		super(id, name);
	}
	
	double salary;
	
	public double calculateAnnualSalary() {
		
		double annualSalary = salary * 12;
		
		return annualSalary;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee em;
		
		System.out.println("Enter your id and name:");
		int eid = sc.nextInt();
		String ename = sc.next();
		
		em = new Employee(eid, ename);
		
		System.out.println("Enter your monthly salary: ");
		em.salary = sc.nextDouble();
		
		System.out.println("Id: " + eid + " Name: " + ename);
		
		System.out.print("Your annual salary is:");
		System.out.print(em.calculateAnnualSalary());
		
	}

}
