package array;

/*
 *Program to reverse an array by taking array as an input
 *author:@vaishnavipanse
 *date:10/06/2024
 */
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = sc.nextInt();
		int arr[] = new int[size]; // Initializing an array

		// Input an array
		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Loop to reverse the array
		for (int i = 0; i < arr.length / 2; i++) {
			// Swap the elements
			int t = arr[i]; // Store the current element in a temporary variable
			arr[i] = arr[arr.length - i - 1]; // Swap the current element with the corresponding element from the end
			arr[arr.length - i - 1] = t; // Assign the temporary variable to the end element

		}
		System.out.println("Reversed array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}

}
