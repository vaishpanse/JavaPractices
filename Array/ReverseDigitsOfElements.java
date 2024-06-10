package array;

/*
 * Program to reverse each digit of each element in an array
 * author:@vaishnavipanse
 * date:10/06/2024
 */
public class ReverseDigitsOfElements {
	public static void main(String[] args) {
		int a[] = { 123, 456, 789, 87545 };
		// Create an array to store the reversed numbers, with the same length as the original array
		int reversedArray[] = new int[a.length];

		// Loop through each element in the original array
		for (int i = 0; i < a.length; i++) {
			int num = a[i]; // Get the current number to be reversed
			int reversedNum = 0; // Variable to store the reversed number

			// Loop to reverse the digits of the number
			while (num > 0) {
				int digit = num % 10; // Get the last digit of the number
				reversedNum = reversedNum * 10 + digit; // Add the digit to the reversed number
				num /= 10; // Remove the last digit from the number
			}
			// Store the reversed number in the new array
			reversedArray[i] = reversedNum;
		}

		// Loop to print the reversed numbers
		for (int i = 0; i < reversedArray.length; i++) {
			// Print each reversed number followed by a space
			System.out.print(reversedArray[i] + " ");
		}
	}

}
