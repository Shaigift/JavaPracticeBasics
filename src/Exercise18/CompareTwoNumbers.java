package Exercise18;

import java.util.Scanner;

public class CompareTwoNumbers {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int first_integer;
	int second_integer;
	
	System.out.print("Input first integer: ");
	first_integer = in.nextInt();
	
	System.out.print("Input second integer: ");
	second_integer = in.nextInt();
	
	if (first_integer == second_integer)
		System.out.printf("%d == %d\n", first_integer, second_integer);
	
	if (first_integer != second_integer)
		System.out.printf("%d != %d\n", first_integer, second_integer);
	
	if (first_integer < second_integer)
		System.out.printf("%d < %d\n", first_integer, second_integer);
	
	if (first_integer > second_integer)
		System.out.printf("%d > %d\n", first_integer, second_integer);
	
	if (first_integer <= second_integer)
		System.out.printf("%d <= %d\n", first_integer, second_integer);
	
	if (first_integer >= second_integer)
		System.out.printf("%d >= %d\n", first_integer, second_integer);
	
	
	}

}
