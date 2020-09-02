package Exercise20;

import java.util.Scanner;

public class AreaOfPolygon {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please give the number of sides on the polygon: ");
		int sidenumber = in.nextInt();
		System.out.print("Please give the length of one of the sides: ");
		double side = in.nextDouble();
		System.out.print("The area is: " + polygonArea(sidenumber, side)+"\n");
		
		
	}
	public static double polygonArea(int sidenumber, double side) {
		return (sidenumber *(side * side)) / (4.0 * Math.tan((Math.PI/side)));
		
		
	}

}
