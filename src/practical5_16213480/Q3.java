package practical5_16213480;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of integers to be read: ");
		int a = input.nextInt();
		int[] myarray = new int[a];

		System.out.println("Please enter the numbers in the array: ");
		for (int i = 0; i < myarray.length; i++) {
			myarray[i] = input.nextInt();
		}

		System.out.println(isConsecutiveFour(myarray, a));
	}


	public static boolean isConsecutiveFour(int values[], int a) {
		if (a < 4) {
			return false;
		}
		else {
			int consCount = 1;
			for (int i = 0; i < a-1; i++) {
				if (values[i] == values[i+1]) {
					consCount++;
					if (consCount == 4) {
						break;
					}
				}
				else {
					consCount =1;
				}	
			}
			if (consCount >= 4) {
				return true;
			}
			else {
				return false;
			}

		}
	}
}