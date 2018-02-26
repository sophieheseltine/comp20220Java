package practical5_16213480;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of integers to be read: ");
		int a = input.nextInt();
		int[] myarray = new int[a];

		System.out.println("Please enter the numbers in the array: ");
		for (int i = 0; i < myarray.length; i++) {
			myarray[i] = input.nextInt();
		}

		System.out.println(isSorted(myarray) ? "The array is sorted" : "The array is not sorted");


	}


	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] > arr[i]) {
				return false;
			}
		}

		return true;
	}

}


