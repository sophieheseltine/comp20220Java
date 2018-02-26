package practical5_16213480;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String reverse1 = "";
		String reverse2 = "";

		System.out.print("Enter a string: ");
		String s1 = input.nextLine();

		System.out.println("Enter another string: ");
		String s2 = input.nextLine();

		for (int i = s1.length() - 1; i >= 0; i--) {
			reverse1 = reverse1 + s1.charAt(i);
		}

		for (int i = s2.length() - 1; i >= 0; i--) {
			reverse2 = reverse2 + s2.charAt(i);
		}

		if (reverse1.length() < reverse2.length()) {
			int a1 = reverse1.length();
			System.out.println("The largest common suffix of " + s1 + " and " + s2 + " is: " + getLCS(reverse1, reverse2, a1));
		}
		else if (reverse2.length() < reverse1.length()) {
			int a1 = reverse2.length();
			System.out.println("The largest common suffix of " + s1 + " and " + s2 + " is: " + getLCS(reverse1, reverse2, a1));
		}

		else {
			System.out.println("There is no common suffix.");
		}
	}


	public static String getLCS(String reverse1, String reverse2, int a1) {
		String suffix = "";
		for (int i = 0; i < a1; i++) {
			if (reverse1.charAt(i) != reverse2.charAt(i)) {
				break;
			}
			else {
				suffix += reverse1.charAt(i);
			}
		}

		String reverse = "";
		for (int i = suffix.length() - 1; i >= 0; i--) {
			reverse = reverse += suffix.charAt(i);
		}
		return reverse;
	}

}

