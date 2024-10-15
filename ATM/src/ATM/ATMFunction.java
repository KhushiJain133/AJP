package ATM;

import java.util.Scanner;

public class ATMFunction {
	
	
	public static void main(String[] args) {
		
		int[] balance = {15000,20000,30000,24000,550000,600000};
		int[] pin = {1234, 2345, 3456, 4567, 5678, 6789};
		String[] phone = {"3434343234","2929292929","9393939393","7457457455","8763429855","9653421900"};
		String[] account_number = {"123412341234", "234523452345", "345634563456", "456745674567", "567856785678", "678967896789"};
		String[] account_holder_name = {"Akay", "Ritik", "Deep", "Geet", "Yuvi", "gazal"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		String acc_num = sc.nextLine();
		
		for(int i=0; i< account_number.length; i++){
			if (acc_num.equals(account_number[i])) {
				
				
				int attempt = 3;
				
				
				do {
					System.out.println("Enter Pin : ");
					int user_pin=  sc.nextInt();
					attempt--;
					
					if(user_pin == pin[i]) {
						attempt = 0;
						
						System.out.println("Welcome " + account_holder_name[i]);
						int choice;
						do{
							System.out.println("1.Change pin");
							System.out.println("2.Check balance");
							System.out.println("3.Change phone number");
							System.out.println("4.Withdraw amount");
							System.out.println("5.Deposit amount");
							System.out.println("6.Logout");
							
							System.out.println("Enter your choice:");
							choice = sc.nextInt();
							
							switch(choice) {
							
							case 1: 
								System.out.println("Enter your old pin: ");
								int old_pin = sc.nextInt();
								
								if(old_pin == pin[i]) {
									System.out.println("Enter New Pin: ");
									int new_pin = sc.nextInt();
									
									System.out.println("Renter New Pin: ");
									int rnew_pin = sc.nextInt();
									
									if(new_pin == rnew_pin) {
										pin[i] = new_pin;
										System.out.println("Pin changed succesfully.");
									}
									
									
								}else {
									System.out.println("invalid old pin.");
								}
								break;
									 
							case 2: 
								System.out.println("Your balance is " + balance[i]);
								break;
							case 3:
								System.out.println("Enter your previous phone number: ");
								String old_phno = sc.nextLine();
								
								if(old_phno == phone[i]) {
									System.out.println("Enter New Phone number: ");
									String new_phno = sc.nextLine();
									
									System.out.println("Renter New Phone number: ");
									String rnew_phno = sc.nextLine();
									
									if(new_phno == rnew_phno) {
										phone[i] = new_phno;
										System.out.println("Phone number changed succesfully.");
									}	
								}
								else {
									System.out.println("Invalid old number.");
								}
								break;
							case 4:
								System.out.println("Enter the amount you want to withdraw: ");
								int withdraw_amount = sc.nextInt();
								
								balance[i] -= withdraw_amount;
								
								System.out.println("Amount withdraw succesfully");
								break;
							case 5:
								System.out.println("Enter the amount you want to deposit: ");
								int deposit_amount = sc.nextInt();
								
								balance[i] += deposit_amount;
								
								System.out.println("Amount deposit succesfully");
								break;
							case 6:
								System.out.println("Logout succesfully.");
								break;
							default : System.out.println("Enter valid choice.");
							}
							
							
							}while(choice != 6);
						
						
						
						
					}
					else {
						System.out.println("You have " + attempt + " more attempts.");
					}
				}while(attempt !=0);
				
			}
			
		}
		
	}
	
	
}
