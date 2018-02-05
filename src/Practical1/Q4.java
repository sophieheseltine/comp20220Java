package Practical1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of years: ");
		int years = input.nextInt();
		
		int pop = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * years);
		
		System.out.println("The population in " + years + " years is " + pop);
		

	}

}
