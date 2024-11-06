package Array;

import java.util.Scanner;

public class ArrayOneD {
	
	int[] arr;
	int index;
	static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	public ArrayOneD(int size) 
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

public static int[] storePrimeNum() {
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
	return new_arr;
	}

	public int maxInArr(int[] arr) {
		
		int max = arr[0];
		
		for(int x:arr) {
			if(max < x) {
				max = x;
			}
		}
		
		return max;
	}
	
public int minInArr(int[] arr) {
		
		int min = arr[0];
		
		for(int x:arr) {
			if(min > x) {
				min = x;
			}
		}
		
		return min;
	}
public static void main(String[] args) {
		
		
		
		
		//a.
				int [] prime_arr = storePrimeNum();
				for(int x:prime_arr) {
					System.out.print(x + " ");
				}
				System.out.println();
		
		//b.
		
				System.out.println("Enter size for array : ");
				ArrayOneD aa = new ArrayOneD(sc.nextInt());
		System.out.println("Enter array elements:");
		for(int i=0; i<aa.arr.length; i++) {
			aa.arr[i] = sc.nextInt();
			aa.index++;
		}
		
		int sum = aa.arrAddition(aa.arr);
		System.out.println("The sum of the array is:" + sum);
		 //c. 
		
		System.out.println("The largest value in array is : ");
		int max_num = aa.maxInArr(aa.arr);
		System.out.println(max_num);
		
		System.out.println("The smallest value in array is : ");
		int min_num = aa.minInArr(aa.arr);
		System.out.println(min_num);
		
		
		
		
}
}
