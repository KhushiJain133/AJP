package MethodDemo;

public class Methods {
	
	
	public int countDigits(int n)
	{
		int d=0;
		
		while(n>0) 
		{
			n/=10;
			d++;
		}
		return d;
	}
	
	public int calculatePower(int n, int e)
	{
		int r=1;
		
		for(int i=1; i<=e;i++) r*=n;
		
		return r;
		
	}
	
	
	public boolean checkPrime(int n) {
		if(n == 0) {
			return false;
		}
		else if(n == 1) {
			return false;
		}
		else {
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
			}
		return true;
	}
	
	public boolean checkEvenOdd(int n) {
		if(n%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean checkArmstrong(int n) {
		Methods m1=new Methods();
		
		int dc = m1.countDigits(n);
		int sum=0;
		
		for(int num = n; num>0; num/=10)
		{
			int rem= num%10;
			int r = m1.calculatePower(rem, dc);
			sum += r;
			

		}
		if(n == sum) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
