package Exercise7;

import java.util.Scanner;

public class MultipleOfNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Give first number: ");
		int number1 = in.nextInt();
		
		
		for(int i=0; i<10; i++) {
			System.out.print(number1 + (i+1) + " = " +
					number1 * (i+1));
			
		}	
		
	
	}

}
