package array;

/*
 * Program to find largest element in an array
 * author:@vaishnavipanse
 * date:10/06/2024
 */

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = { 12, 45, 6, 23, 78,90, -90 };

		// Initialize the variable to hold the largest element
		int largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			// Check if the current element is greater than 'largest'
			if (arr[i] > largest) {
				// If yes, update 'largest' with the current element
				largest = arr[i];
			}
		}
		System.out.println("Largest element in an array is " + largest);
	}

}
