package pack2;

public class MyException extends Exception{
	
	public MyException (String msg) {
		super (msg);
		
		System.out.println("We are inside the custom exception class");
	}

}
