package practical3_16213480;

import java.util.*;

public class Q1 {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	
	//Prompt user to enter a string
	System.out.println("Enter a string: ");
	String string1 = input.nextLine();
	//convert string to lower case
	String string2 = string1.toLowerCase();
	
	int vowelCount = 0;
	int consCount = 0;

	//iterate over characters in the string
	for (int i = 0; i < string2.length(); ++i) {
		char ch = string2.charAt(i);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			++vowelCount;
		}
		else if ((ch >= 'a' && ch <= 'z')) {
			++consCount;
		}
	}
	
	//display results
	System.out.println("Vowels: " + vowelCount);
	System.out.println("Consonants: " + consCount);
	}
}
