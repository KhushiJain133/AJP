package Array;

import java.util.Scanner;

public class RotateArray{
	
	static Scanner sc=new Scanner(System.in);

	public static void display(int a[])
	{
		for(int x:a) System.out.print(x+"\t");
		System.out.println();
	}
	
	//Q3. wap to shift the elements of an array clockwise(right to left)
			// ask user for number of rotations = 1
			// 0	1	2	3	4	5	6	7	8	9
			// 11	12	13	14	15	16	17	18	19	20
			// 20	11	12	13	14	15	16	17	18	19	first rotation
			// 19	20	11	12	13	14	15	16	17	18	second rotation
	public static void rotationRToL(int[] arr) {
		
		System.out.println("Enter number of rotations : ");
		int n=sc.nextInt();
		for(int m=0;m<n;m++)
		{
			// step 1 : store the last element into a temp variable
			int temp = arr[arr.length-1];
			for(int i=arr.length-1; i>0; i--)// i=0  
			{
				arr[i]=arr[i-1]; // a[1]=a[0]
			}
			arr[0]=temp;
			System.out.println("Array after clockwise rotation no "+(m+1)+" :- ");
			display(arr);
		}
	}

			// Q4. wap to shift elements of array anticlockwise(left to right)
//				0	1	2	3	4	5	6	7	8	9
//				11	12	13	14	15	16	17	18	19	20
			//  12	13	14	15	16	17	18	19	20	11 FIRST ROTATION	
	
public static void rotationLToR(int[] arr) {
		
		System.out.println("Enter number of rotations : ");
		int n=sc.nextInt();
		for(int m=0;m<n;m++)
		{
			// store the first element into a temp variable
			int temp = arr[0];
			for(int i=1; i<arr.length; i++)  
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
			System.out.println("Array after clockwise rotation no "+(m+1)+" :- ");
			display(arr);
		}
	}
	
	public static void main(String[] args) 
	{
		int a[]= {11,12,13,14,15,16,17,18,19,20};
		
		
		
		System.out.println("Before Rotation : ");
		display(a);
		
		System.out.println("1. Right to left");
		System.out.println("2. Left to right");
		
		if(sc.nextInt() == 1) {
			rotationRToL(a);
		}
		else {
			rotationLToR(a);
		}
		
		// step 2 :rotate array
		
		
		
		
		
		
	}
}
// 9=8
// 8=7
// 7=6
// 6=5
// 5=4
// 4=3
// 3=2
// 2=1
// 1=0
// 0= temp
