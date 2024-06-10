package numbers;

/*
 * Program to find number of digits in an integer
 * author:@vaishnavipanse
 * date:10/06/2024
 */
import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			int r = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println("Number of digits = " + count);
		sc.close();
	}

}
