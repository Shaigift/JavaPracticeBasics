package Exercise6;

import java.util.Scanner;

public class DifferentOperations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Give first number: ");
		int  number1 = in.nextInt();
		
		System.out.print("Give second number: ");
		int  number2 = in.nextInt();
		
		System.out.println(number1 + " + " +  number2 + " = " +
		(number1 + number2));
		
		System.out.println(number1 + " - " +  number2 + " = " +
		(number1 - number2));
		
		
		System.out.println(number1 + " * " +  number2 + " = " +
		(number1 * number2));
		
		
		System.out.println(number1 + " % " +  number2 + " = " +
		(number1 / number2));
		
		
		
		
		
	}

}
