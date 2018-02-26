package practical1_16213480;

import java.util.Scanner;

public class Q7 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter temperature between -58F and 41F: ");
		double temp = input.nextDouble();
		
		System.out.println("Enter wind speed in miles per hour (must be greater than or equal to 2): ");
		double wind = input.nextDouble();
		
		double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temp * Math.pow(wind, 0.16);
		
		System.out.println("Wind chill is " + windChill);
		
	}

}
