package practical1_16213480;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter subtotal of your meal: ");
	double subtotal = input.nextDouble();
	
	System.out.println("Enter the gratuity rate (as 0.15 for example: ");
	double gratuityRate = input.nextDouble();
	gratuityRate = gratuityRate/100;
	
	double gratuity = gratuityRate * subtotal;
	System.out.println("The gratuity due on this meal is " + gratuity);
	
	double total = gratuity + subtotal;
	System.out.println("The total of this meal, including gratuity, is " + total);
}
}