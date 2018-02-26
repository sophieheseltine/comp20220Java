package practical4_16213480;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.nextLine();
		
		System.out.println(password + (isValidPassword(password) ? " is valid" : " is invalid"));
	}
	
	//check that the length of the input is greater than 8
	public static boolean hasValidLength(String password) {
			if (password.length() >= 8) {
				return true;
				}
				else {
					return false;
					}
	}

	//check that the password has upper case, lower case and digit		
	public static boolean containsLettersDigits(String password) {
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (Character.isUpperCase(ch)) hasUpperCase = true;
			if (Character.isLowerCase(ch)) hasLowerCase = true;
			if (Character.isDigit(ch)) hasDigit = true;
		}		
		if (hasUpperCase && hasLowerCase && hasDigit) {
			return true;
			}
		else {
		return false;
}
}
	
	//check that the password has at least one lower case letter and two digits
	public static boolean satisfiesCountCheck(String password) {
		int letterCount = 0;
		int digitCount = 0;
		
		for (int i = 0; i < password.length(); ++i) {
			char ch = password.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				++letterCount;
			}
			else if ((ch >= '0' && ch <= '9')) {
				++digitCount;
			}
		}
		if (letterCount >= 1 && digitCount >= 2) {
			return true;
		}
			else {
				return false;
			}
		}
	
	
	//main method - return true only if all other methods return true
	public static boolean isValidPassword(String password) {
		if (hasValidLength(password) && containsLettersDigits(password) && satisfiesCountCheck(password)) {
			return true;
		}
		else {
		return false;
	}
	
	}
}

