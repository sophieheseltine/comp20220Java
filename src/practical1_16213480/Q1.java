package Practical1;

import java.util.Scanner;

public class Q1 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of a cylinder: ");
		double radius = input.nextDouble();
		
		System.out.println("Enter the length of a cylinder: ");
		double length = input.nextDouble();
		
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("The area of the cylinder of radius " + radius + " is " + area);
		
		double volume = area * length;
		
		System.out.println("The volume of the cylinder is " + volume);
	}

}
