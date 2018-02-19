package Practical1;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point in the format x1 x2: ");
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		
		
		System.out.println("Enter another point in the format y1 y2: ");
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.println("The distance between point 1 and point 2 is " + distance);
	
				
	}
}