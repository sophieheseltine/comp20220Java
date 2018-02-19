package Practical1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches: ");
			double height = input.nextDouble();
		System.out.println("Enter your weight in pounds: ");
			double weight = input.nextDouble();
		
		height = height*0.0254;
		weight = weight*0.45359237;
			
		double bmi = weight/Math.pow(height, 2);
		
		System.out.println("BMI is " + bmi);

	}

}
