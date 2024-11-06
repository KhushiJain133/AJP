package constructor;

import java.util.Scanner;

public class StudentDemo {
	
		public Student generateRecord()
		{
			Student st1=new Student();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Student ID:  ");
			st1.setSid(sc.nextInt());
			// 101 \0
			
			sc.nextLine();
			System.out.println("Enter Student Name : ");
			st1.setName(sc.nextLine());
			
			System.out.println("Enter Age : ");
			st1.setAge(sc.nextInt());
			
			
			System.out.println("Enter Course : ");
			st1.setCourse(sc.next());
			
			System.out.println("Enter Marks : ");
			st1.setMarks(sc.nextFloat());
			
			return st1;
		}
		public static void main(String[] args)
		{
			StudentDemo sd=new StudentDemo();
			
			
			Student s1= sd.generateRecord();
			Student s2= sd.generateRecord();
			
			System.out.println(s1);
			
			System.out.println(s2);

		}

	}


