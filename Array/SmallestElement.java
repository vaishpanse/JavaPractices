/*
 * Program to find smallest element in an array
 * author:@vaishnavipanse
 * date:10/06/2024
 */

public class SmallestElement {
	public static void main(String[] args) {
		int arr[] = { 12, 45, 6, 23, 78, -90 };

		// Initialize the variable to hold the largest element
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			// Check if current element is smaller than smallest
			if (arr[i] < smallest) {
				// If yes, update 'smallest' with the current element
				smallest = arr[i];
			}
		}
		System.out.println("Smallest element in an array is " + smallest);
	}
}
