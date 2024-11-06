package operators;

public class CheckBit {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		String binary = Integer.toBinaryString(num);
		
		String result = (binary.charAt(binary.length()-n) == '1')? "set (1)" : "not set (0)";
		
		System.out.println(result);
		
	}

}
