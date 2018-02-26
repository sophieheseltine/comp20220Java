package practical3_16213480;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string1 = input.nextLine();
		
		System.out.println("Enter a second string: ");
		String string2 = input.nextLine();
		
		//find the minimum length of the two strings
		int minLength = Math.min(string1.length(), string2.length());
		
		String commonPrefix = "";
		
		//iterate over each element in the string
		for (int i = 0; i < minLength; i++) {
			if (string1.charAt(i) == string2.charAt(i)) {
				commonPrefix += string1.charAt(i);
			}
			else 
				break;
	}

        if (commonPrefix.length() != 0) {
        		System.out.println("The common prefix is: " + commonPrefix);
        }
        else {
            System.out.println(string1 + " and " + string2 + " have no common prefix.");
        }
	}
}
