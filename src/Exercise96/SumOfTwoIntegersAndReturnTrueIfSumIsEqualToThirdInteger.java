package Exercise96;

import java.util.Scanner;

public class SumOfTwoIntegersAndReturnTrueIfSumIsEqualToThirdInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please give the first number: ");
		int firstnumber = in.nextInt();
		
		System.out.println("Please give the second number: ");
		int secondnumber = in.nextInt();
		
		
		System.out.println("Please give the third number: ");
		int thirdnumber = in.nextInt();
		System.out.print("The result is " +sumofnumbers( firstnumber, secondnumber, thirdnumber));
	}
		
		
	public static boolean sumofnumbers(int firstnumber, int secondnumber, int thirdnumber) {
		
			return((firstnumber + secondnumber == thirdnumber || (secondnumber + thirdnumber) == firstnumber || (thirdnumber + firstnumber) == secondnumber));
			
		}
	

	}

