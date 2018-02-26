package practical2_16213480;

import java.util.Scanner;

public class q3test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in decimal: ");
		int decimalnum = input.nextInt();
		
		if ((decimalnum < 0) || (decimalnum > 15)) {
			System.out.println("Number must be between 0 and 15.");
		}
		
		else {
			switch (decimalnum) {
			case 1: System.out.println("1"); break;
			case 2: System.out.println("2"); break;
			case 3: System.out.println("3"); break;
			case 4: System.out.println("4"); break;
			case 5: System.out.println("5"); break;
			case 6: System.out.println("6"); break;
			case 7: System.out.println("7"); break;
			case 8: System.out.println("8"); break;
			case 9: System.out.println("9"); break;
			case 10: System.out.println("A"); break;
			case 11: System.out.println("B"); break;
			case 12: System.out.println("C"); break;
			case 13: System.out.println("D"); break;
			case 14: System.out.println("E"); break;
			case 15: System.out.println("F"); break;
			
			}
			
		}
		

	}

}
