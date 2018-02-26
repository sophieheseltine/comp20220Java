package practical2_16213480;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the three lengths of a triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if ((a + b > c) || (b + c > a) || (a + c > b)) {
			System.out.println("Input valid.");
		}
		else {
			System.out.println("Input invalid.");
			}
	}
}
