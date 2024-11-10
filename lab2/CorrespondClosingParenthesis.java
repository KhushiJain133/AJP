package lab2;

import java.util.Scanner;

public class CorrespondClosingParenthesis {
	
	public int closingParenthesisPosition(String sentence, int open_idx) {
		int close_idx = -1;
		int otherparenthesis = 0;
		
		for(int i=open_idx+1; i<sentence.length(); i++) {
			if(sentence.charAt(i) == '(') {
				otherparenthesis++;
			}
			else if(sentence.charAt(i)  == ')') {
				if(otherparenthesis > 0) {
					otherparenthesis--;
				}
				else {
					close_idx = i;
				}
			}	
		}
		return close_idx;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CorrespondClosingParenthesis cp = new CorrespondClosingParenthesis();
		
		System.out.println("Enter a sentence with nested parenthesis: ");
		String sentence = sc.nextLine();
		
		System.out.println("Enter the index of opening parenthesis: ");
		int o_index = sc.nextInt();
		
		if(sentence.charAt(o_index)== '(') {
			
			int c_index = cp.closingParenthesisPosition(sentence, o_index);
			
			if(c_index == -1) {
				System.out.println("Paranthesis never closed.");
			}
			else {
			System.out.println("The correspond closing bracket is at index : " + c_index);
			}
			
		}
		else
		{
			System.out.println("Enter valid index.");
		}
		
		
		
	}
}
