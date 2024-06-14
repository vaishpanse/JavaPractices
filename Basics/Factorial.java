/*
 * Program to calculate factorial of a number
 * author:@vaishnavipanse
 * date:08/06/2024
 */
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		// Initialize the variable to hold the factorial result
		int factorial = 1;

		// If the number is 0 or 1, the factorial is 1
		if (num == 0 || num == 1) {
			factorial = 1;
		}

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
		sc.close();
	}

}
