package Exercise13;

import java.util.Scanner;

public class AreaAndPerimeterOfARectangle {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		double perimeter;
		double area;
		double bredth;
		double length;
		
		System.out.print("Please give length: ");
		length = in.nextInt();
		
		System.out.print("Please give bredth: ");
		bredth = in.nextInt();

	    perimeter = length * bredth ;
	    area = length * length;

	        System.out.println("Perimeter is = " + perimeter);
	        System.out.println("Area is = " + area);
	    }
	  }
