package practical2_16213480;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b,  2) - 4 * a * c;
		
		if (a == 0) {
			System.out.println("Number cannot be zero.");
		}
		
		
		else if (discriminant > 0) {
			double r1 = (-1 * b + Math.pow(discriminant, 0.5)) / (2 * a);
			double r2 = (-1 * b - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}

		else if (discriminant == 0) {
			double r3 = (-1 * b) / (2 * a);
			System.out.println("The root is " + r3);
		}
		
		else {
			System.out.println("The equation has no real roots.");
		}
		
	}
	
	

}
