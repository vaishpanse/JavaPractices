/*
 * Program to check whether the number is prime or not
 * author:@vaishnavipanse
 * date:08/06/2024
 */
import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();

		// Initialize a boolean variable to true
		// This variable will be used to determine if the number is prime
		boolean isPrime = true;

		if (num == 0 || num == 1 || num < 0) {
			isPrime = false;
		}

		for (int i = 2; i < num / 2; i++) {
			// If 'num' is divisible by 'i', set 'isPrime' to false
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
		sc.close();
	}

}
