package practise;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int temp = number;
		int reversed = 0;

		while (temp != 0) {
			int lastDigit = temp % 10;
			reversed = reversed * 10 + lastDigit;
			temp /= 10;
		}

		if (number == reversed) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}
}
