package Practical1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a number between 0 and 999.
		System.out.println("Please enter a number between 0 and 999: ");
		int number1 = input.nextInt();
		
		
		int smallNumbers = number1 % 10;
		number1 /= 10;
		
		int tens = number1 % 10;
		number1 /= 10;
		
		int hundreds = number1 % 10;
		number1 /= 10;
		
		int total = hundreds + tens + smallNumbers;
		
		System.out.println("The sum of the digits is " + total);

	}

}
