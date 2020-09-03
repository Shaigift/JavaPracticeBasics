package Exercise29;

import java.util.Scanner;

public class UniqueThreeDigitNumber {
	public static void main(String[] args) {
		Scanner anynumber = new Scanner(System.in);
		System.out.print("Please give number: ");
		int integers = anynumber.nextInt();
		count(integers);
		
	}
	public static void count(int integers) {
		int numbers = 0;
		for(int i = 1;i <= 4; i++) {
			for(int j = 1; j <=4; j++) {
				for(int k = 1; k <=4; k++) {
					if(k != i && k !=j && i !=j) {
						numbers++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.print("Total number of the three-digit-number is" + numbers);
	}

}
