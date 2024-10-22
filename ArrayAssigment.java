package Array;

import java.util.Scanner;

public class ArrayAssigment {
	
	int[] arr;
	int index;
	static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	public ArrayAssigment(int size) 
	{
		arr = new int[size];
		index=-1;
	}
	
	public int arrAddition(int[] arr1) {
		
		int sum=0;
		
		for(int x:arr1) {
			
			sum += x;
		}
		return sum;
		
	}
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public void storePrimeNum() {
		int new_arr[] = new int[10];
		
		int counter =0;
		int num=2;
		while(counter<10) {
			if(isPrime(num)) {
				new_arr[counter] = num;
				counter++;
			}
			num++;
			
		}
		
		System.out.println("First 10 prime numbers are:");
		for(int x:new_arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		
	}
	
	public boolean searchEle(int[] arr2, int num) {
		
		for(int x:arr2) {
			if(x == num) {
				return true;
			}
		}
		return false;
		
	}
	
	public void deletLastEle(int[] arr3, int index) {
		if(index< arr3.length) {
			arr[index] = 0;
		index--;
		System.out.println("Last Element deleted successfully!!");
		}
		else {
			System.out.println("Nothing to delete! \n Array is empty!!");
		}
	}
	
	
	
	public int[] sortAscending(int[] arr4) {
		
		int temp;
		for(int i=0; i<arr4.length-1; i++) {
			for(int j=0; j<arr4.length-1-i; j++) {
				if(arr4[j]> arr4[j+1]) {
					temp = arr4[j];
					arr4[j] = arr4[j+1];
					arr4[j+1] = temp;
				}
			}
		}
		
		return arr4;
	}
	
public int[] sortDescending(int[] arr4) {
		
		int temp;
		for(int i=0; i<arr4.length-1; i++) {
			for(int j=0; j<arr4.length-1-i; j++) {
				if(arr4[j]< arr4[j+1]) {
					temp = arr4[j];
					arr4[j] = arr4[j+1];
					arr4[j+1] = temp;
				}
			}
		}
		
		return arr4;
	}
	

	
	public static void main(String[] args) {
		
		//Q1
		
		System.out.println("Enter size for array : ");
		ArrayAssigment aa = new ArrayAssigment(sc.nextInt());
	
		System.out.println("Enter array elements:");
		for(int i=0; i<aa.arr.length; i++) {
			aa.arr[i] = sc.nextInt();
			aa.index++;
		}
		
		int sum = aa.arrAddition(aa.arr);
		System.out.println("The sum of the array is:" + sum);
		
		
		//Q2
		aa.storePrimeNum();
		
		
		//Q3
		System.out.println("Enter a number to search in array:");
		int ele = sc.nextInt();
		boolean flag = aa.searchEle(aa.arr, ele);
		if(flag == true) {
			System.out.println("Element found!!");
		}
		else {
			System.out.println("Element not found!!");
		}
		
		//Q4
		aa.deletLastEle(aa.arr, aa.index);
		
		//Q5
		System.out.println("Initial array is:");
		for(int x:aa.arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		for(int x:aa.sortAscending(aa.arr)) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		for(int x:aa.sortDescending(aa.arr)) {
			System.out.print(x + " ");
		}
		
	}

	
}
