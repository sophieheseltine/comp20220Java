//Program to convert decimal number to hexadecimal
//Code from https://www.w3resource.com/java-exercises/basic/java-basic-exercise-20.php
package practical2_16213480;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Initialise the hex number to empty string
		String hexadecnum = "";
		
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println("Enter a number in decimal: ");
		int decimalnum = input.nextInt();
		
		if (decimalnum > 0) {
			int remainder = decimalnum % 16;
			hexadecnum = hex[remainder] + hexadecnum;
			decimalnum = decimalnum / 16;
		}
		
		System.out.println("Hexadecimal number is " + decimalnum + hexadecnum);

	}

}
