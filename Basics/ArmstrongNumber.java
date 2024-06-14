/*
 * Program to check whether the number is armstrong number or not
 * author:@vaishnavipanse
 * date:09/06/2024
 * An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the 
 * number of digits. 
 * For example, a 3-digit Armstrong number is defined as a number that is equal to the sum of the cubes of its digits.
 */

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int arm = 0; // Variable to store an armstrong number
		int temp = num; // Temporary variable to store the original number

		while (num > 0) {
			int rem = num % 10; // Get the last digit of the number
			arm = arm + (rem * rem * rem); // Add the cube of the digit to the arm variable
			num = num / 10; // Remove last digit from a number
		}

        // Check if the computed sum is equal to the original number
		if (arm == temp) {
			System.out.println(temp + " is an armstrong  number");
		} else {
			System.out.println(temp + " is not an armstrong number");
		}

	}
}
