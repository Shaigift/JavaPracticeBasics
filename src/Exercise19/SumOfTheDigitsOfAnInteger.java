package Exercise19;

import java.util.Scanner;

public class SumOfTheDigitsOfAnInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Give a digit: ");
		long digit = in.nextInt();
		System.out.println("The sum of the digits is " + sumDigits(digit));
		
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}

}
