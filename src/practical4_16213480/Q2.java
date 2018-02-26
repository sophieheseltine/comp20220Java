package practical4_16213480;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		//read input to check if it is a perfect number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a perfect number: ");
		int perfect = input.nextInt();
		
		System.out.println(perfect + (isPerfectNumber(perfect) ? " is a perfect number" : " is not a perfect number"));
		
		//find the first 4 perfect numbers
		int count = 0;
		for (int i = 0; count < 4; i++) {
			if (isPerfectNumber(i)) {
				System.out.println(i + " is a perfect number.");
				count++;
				}
			}
			}
	
	
		
	public static boolean isPerfectNumber(int perfect) {
		int perfectNum = 0;
		if (perfect == 0) {
			return false;
		}
		for (int i = 1; i <= perfect/2; i++) {
			if (perfect % i == 0) {
					perfectNum += i;
				}
			}
			return(perfectNum == perfect);
				}
	
	
	
	}
