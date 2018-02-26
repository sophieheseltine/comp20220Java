package examples;

import java.util.Scanner;

public class Lecture4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		
		
		// 1. if by itself
		if (radius >= 0) {
			double area = radius * radius * Math.PI;
			System.out.println("Area is " + area);
		}
		
		
		// 2. if else
		if (radius < 10) {
			double area = Math.pow(radius,  2) * Math.PI;
			System.out.println("Area is " + area);	
		}
		
		else
			System.out.println("Radius must be less than 10.");

		// 3. EPSILON - shows a number is "close enough"
		final double EPSILON = 1e-14;
		double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		if (Math.abs(x-0.5) < EPSILON)
			System.out.println(x + "is approx 0.5");
	
		
		// 4. Leap year
		System.out.println("Enter year");
		double year = input.nextDouble();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		System.out.println(isLeapYear);
	
	}

}
