package practical3_16213480;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string1 = input.nextLine();
		String string2 = "";
		
		for (int i = 0; i < string1.length(); i++) {
			char ch = string1.charAt(i);
			if (ch == 'z') 
				string2 += 'a';
			
			else if (Character.isLowerCase(ch)) {
				int a = (int)ch;
				a++;
				char b = (char)a;
				string2 += b;
				
			}
			else
				string2 += ch;
		}
		
		System.out.println("New string is: " + string2);
	}

}
