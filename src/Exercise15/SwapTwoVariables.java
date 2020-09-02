package Exercise15;

public class SwapTwoVariables {
	public static void main(String[] args) {
		
		String b, a, temp;
		b = "Mpho";
		a = "Hello";
		
		System.out.println("The value of b before the swap is "+b);
		System.out.println("The value of a before the swap is "+a);
		temp = b;
		b = a;
		
		a = temp;
		
		
		System.out.println("The value of b after the swap is "+b);
		System.out.println("The value of a after the swap is "+a);
		
		
		
		
	}

}
