package numbers;

/*
 * Program to print fibonacci series upto the length of given number
 * author:@vaishnavipanse
 * date:09/06/2024
 * The Fibonacci series is a series where the next term is the sum of the previous two terms.
   The first two terms of the Fibonacci sequence are 0 followed by 1.
 */
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		// Initialize the first term of the Fibonacci series to 0
		int ft = 0;
		// Initialize the second term of the Fibonacci series to 1
		int st = 1;

		System.out.println("Fibonacci series upto "+num+"th term is:");
		// Loop to generate and print the Fibonacci series up to 'num' terms
		for (int i = 1; i <= num; i++) {
			System.out.print(ft + " "); // Print the current term
			int nt = ft + st; // Calculate the next term
			ft = st; // Update the first term to the second term
			st = nt; // Update the second term to the newly calculated next term
		}
		sc.close();
	}

}
