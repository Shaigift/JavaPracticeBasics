package Exercise54;

import java.util.Scanner;

public class CheckNumberIfEven {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please give a number: ");
		int number = in.nextInt();
			if(number % 2 == 0) {
				System.out.println(1);
		
			}
		else {
			System.out.println(0);			
		}
	

		
	}

	

}
