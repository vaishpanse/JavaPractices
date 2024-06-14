/*
 * Program to reverse the number
 * author:@vaishnavipanse
 * date:07/06/2024
 */
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Creating Scanner object to take input from user
		System.out.println("Enter number:");
		int num = sc.nextInt(); //Reading the integer input from user
		int revNum = 0; //Variable to store reversed number

		//Loop to reverse the number
		while (num > 0) {
			int r = num % 10; //Getting the last digit of number
			num = num / 10; // Removing the last digit from the number
			revNum = revNum * 10 + r; //Appending the last digit to the reversed number
		}
		System.out.println("Reversed number:");
		System.out.println(revNum);
		
		sc.close();
	}

}
