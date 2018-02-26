package practical1_16213480;

import java.util.Scanner;

public class Q8 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the distance to drive: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter the fuel efficiency of the car in miles per gallon: ");
		double fuelEfficiency = input.nextDouble();
		
		System.out.println("Enter the price per gallon of fuel: ");
		double fuelPrice = input.nextDouble();
		
		double tripCost = (distance / fuelEfficiency) * fuelPrice;
		
		System.out.println("The cost of the trip is " + tripCost);
		
	}
}
