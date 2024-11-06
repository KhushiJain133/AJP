package Array;

import java.util.Scanner;

public class SingleDAssignment {

	int arr[];
	int index;
	static Scanner sc;
	
	static
	{
		sc=new Scanner(System.in);
		System.out.println("Single D program Starting....");
		try 
		{
			Thread.sleep(2000);  
		} catch (InterruptedException e) 
		{
				e.printStackTrace();
		}
	}
	
	public SingleDAssignment(int size) 
	{
		arr = new int[size];
		index=-1;
	}
	
	public void menu()
	{
		int choice;
		do
		{
			System.out.println("1. Display Array Elements ");
			System.out.println("2. Insertion at end");
			System.out.println("3. Insertion at Beginning");
			System.out.println("4. Insertion after existing value");
			System.out.println("5. Deletion at end");
			System.out.println("6. Delete first value");
			System.out.println("7. Deletion by Index");
			System.out.println("8. Deletion by Value");
			System.out.println("9. Search a value and Return index");
			System.out.println("10. Rotate array clockwise");
			System.out.println("11. Rotate array Anti-ClockWise");
			System.out.println("12. Sum of Array");
			System.out.println("13. Update existing value of array");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			if(choice==0)
			{
				System.out.println("Goodbye!!");
				break;
			}
			else if(choice == 1 ) display();
			else if(choice==2) insertEnd();
			else if(choice==3) insertBeginning();
			else if(choice==4) insertValueAtMid();
			else if(choice==5) deleteLast();
			else if(choice==6) deleteFirst();
			else if(choice==7) deleteByIndex();
			else if(choice==8) deleteByValue();
			else if(choice==9)
			{
				int idx = searchValue();
				if(idx==-1) System.out.println("Value not found...");
			}
			else if(choice==13) updateIndex();
			else System.out.println("Wrong Choice!! \nTry Again!!");
			
			
		}while(choice!=0);
	}
	
	public boolean isFull()
	{
		if(index==arr.length-1) 
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(index == -1)
			return true;
		else
			return false;
	}
	
	public void insertEnd() 
	{
		if(isFull())
			System.out.println("Array is Full!!\nCan't Insert more values!!");
		else
		{
			System.out.println("Enter a value : ");
		
			
			arr[++index] =sc.nextInt();
			
			System.out.println("Value inserted in Array Successfully!!!");
		}
	}

	public void display() 
	{
		System.out.println("Array Elements : ");
		for(int x:arr)
			System.out.print(x+"\t");
		System.out.println();
	}

	public void shiftArrayClockwise(int sindex)
	{
		for(int i=index+1;i>sindex;i--)
		{
			arr[i]=arr[i-1];
		}
	}
	
	public void shiftArrayAntiClockwise(int sindex)
	{
		for(int i=sindex; i<index;i++ )  
			arr[i]= arr[i+1]; 
		arr[index--]=0; 
		

		
	}
	
	public void deleteFirst()
	{
		if(isEmpty()) System.out.println("Array is Empty!!");
		else
		{
			//call shift method
			shiftArrayAntiClockwise(0);
			System.out.println("Value Deleted Successfully!!");
		}
			
	}
	public void deleteByIndex()
	{
		if(isEmpty()) System.out.println("Array is Empty!!");
		else
		{
			System.out.println("Enter index to delete : ");
			int i=sc.nextInt();
			if(i<0 || i>index) System.out.println("Invalid Index!!");
			else
			{
				shiftArrayAntiClockwise(i);
				System.out.println("Value deleted Successfully!!");
				
				display();
				System.out.println("-----------------------------------------");
			}
				
		}
	}
	public void deleteByValue()
	{
		if(isEmpty())
			System.out.println("Array is Empty!!");
		else
		{
			int idx = searchValue();
			if(idx==-1) System.out.println("Value not Found!!");
			else
			{
				shiftArrayAntiClockwise(idx);
				System.out.println("Value deleted successfully!!");
				display();
				
			}
		}
	}
	public void insertBeginning()
	{
		if(isFull())
			System.out.println("Array is Full!!\nCan't Insert more values!!");
		else
		{
			// shift array elements
			shiftArrayClockwise(0);
			System.out.println("Enter new value : ");
			arr[0]=sc.nextInt();
			index++;
			System.out.println("Value inserted Successfully!!");
		}
	}
	
	public int searchValue()
	{
		System.out.println("Enter value to search : ");
		int s=sc.nextInt();
		
		for(int i=0; i<=index;i++)
		{
			if(arr[i]==s)
			{
				System.out.println("Value found in array at index : "+i);
				return i;
			}
		}
		return -1;
	}
	
	public void insertValueAtMid()
	{
		if(isFull())
			System.out.println("Array is Full!!\nCan't Insert more values!!");
		else if(isEmpty())
		{
			System.out.println("Array is empty!!");
			System.out.println("Do you want to insert at first index(y/n): ");
			char ch = sc.next().charAt(0);
			if(ch == 'y' || ch =='Y') insertBeginning();
			else System.out.println("choose other options..");
		}
		else
		{
			// ctrl +2 then select
			int idx = searchValue();
			if(idx==-1) System.out.println("Value not Found!!");
			else
			{
				//call shift function
				shiftArrayClockwise(idx+1);
				
				System.out.println("Enter new value : ");
				arr[idx+1]=sc.nextInt();
				
				index++;
				System.out.println("Value inserted Successfully!!");
			}
		}
	}
	
	public void updateIndex() {
        if(isEmpty())
        {
            System.out.println("Array is empty");
        }
        else{
            display();
            int x = searchValue();
            if(x == -1)
            {
                System.out.println("Element not found");
            }
            else
            {
                System.out.println("Enter new value: ");
                int value = sc.nextInt();
                arr[x] = value;
                System.out.println("Updation Successfull");
                display();
            }

        }
    }
	
	public void deleteLast()
	{
		if(isEmpty()) System.out.println("Array is Empty!!");
		else
		{
			arr[index--]=0;
			System.out.println("Value deleted Successfully!!");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter size for array : ");
//		int size=sc.nextInt();
		
		SingleDAssignment sd=new SingleDAssignment(sc.nextInt());
		sd.menu();
	}
		

	

}