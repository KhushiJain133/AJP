package lab2;

import java.util.Scanner;

public class SecondHighestNum {
	public static void main(String[] srgs) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("Enter the elements of array:");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] subarr = new int[5];
		int size = subarr.length;
		
		for(int i=0; i<size; i++) {
			subarr[i] = arr[i+2];
		}
		
		
		for(int i=0; i<size-1; i++) {
			
			for(int j=i+1 ; j<size; j++) {
				if(subarr[i] > subarr[j]) {
					int temp = subarr[i];
					subarr[i] = subarr[j];
					subarr[j] = temp;
				}
			}
			
		}
		
		System.out.println("The second largest elsement in the subarray is:");
		System.out.println(subarr[size-2]);
		
		
		for(int x:subarr) {
			System.out.print(x + " ");
		}
	}
}
