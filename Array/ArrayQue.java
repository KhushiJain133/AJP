package Array;

import java.util.Scanner;

public class ArrayQue {
	static Scanner sc = new Scanner (System.in);
	
	public static int[] arrSum() {
		
		System.out.println("Enter the sixe of array: ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		int[] b = new int[size];
		int[] c = new int[size];
		
		System.out.println("Enter elements of first array");
		
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter elements of second array");
		
		for(int i=0; i<size; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			c[i] = a[i] + b[i];
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		//Q1 wap to store table of 5 in the array of size 10.
		
		int[] arr1 = new int[10];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = 5*(i+1);
			
		}
		
		for(int x:arr1) {
			System.out.println(x);
		}
		
		//Q2 wap to reverse the array.
		
		int[] arr2 = {10,20,30,40,50};
		System.out.println("The original array is:");
		for(int x:arr2) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("The reverse of the array is: ");
		
		for(int i=0,j=arr2.length-1; i<j; i++,j--) {
			int temp = arr2[i];
			arr2[i] = arr2[j];
			arr2[j] = arr2[i];
		}
		
		for(int x:arr2) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		 
		// Q5. wap to add elements of two arrays of the same size
		// and store the sum into the third array using functions.
		// a method which returns an array and also recieves two arrays
		// a = 1 2 3 4 5
		// b = 3 4 7 9 2
		// c = 4 6 10 13 7 
		int [] sum_arr = arrSum();
		System.out.println("Sum of the elements of both the array is:");
		for(int x:sum_arr) {
			System.out.print(x + " ");
		}
		
		// Q6. sort an array using bubble sort, insertion sort, quick sort, merge sort
	}
}
