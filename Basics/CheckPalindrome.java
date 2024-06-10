package numbers;

/*
 * Program to check whether the number is palindrome or not.
 * A palindromic number is a number that remains the same when its digits are reversed.
 * author:@vaishnavipanse
 * date:07/09/2024
 */
import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int revNum = 0; // variable to store reversed number
		int temp = num; // Temporary variable to store the original number for comparison
		
		while (num > 0) {
			int r = num % 10; // Getting last digit of a number
			num = num / 10; // Removing last digit from a number
			revNum = revNum * 10 + r; // Appending last digit to the reversed number
		}
		
        // Check if the reversed number is equal to the original number
		if (revNum == temp) {
			System.out.println("It is palindrome.");
		} else {
			System.out.println("It is not palindrome.");
		}
		sc.close();
	}

}
