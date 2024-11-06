package loops;

import java.util.Scanner;

public class PatternQue {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size(should be odd):");
		int n = sc.nextInt();
		
		int space = n / 2;
		int num = 1;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j=0; j<=space; j++) {
				System.out.print(" ");
			}
			
			int count =  1;
			
			for(int k=1; k<= num; k++) {
				System.out.print(count);
				if(k<= num / 2) {
					count++;
				}
				else {
					count--;
				}
			}
			
			System.out.println();
			count = 1;
			if (i <= n / 2) { 
				  
                
                space = space - 1; 
                num = num + 2; 
            } 
  
            else { 
  
               
                space = space + 1; 
                num = num - 2; 
            } 
			
		}
	}

}
