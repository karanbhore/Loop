package practise;

public class DigitManipulation {
	public static void main(String[] args) {
		// Assign a 3-digit number to a variable
		int num = 123;

		// Get each digit separately
		int digit1 = num / 100;
		int digit2 = (num / 10) % 10;
		int digit3 = num % 10;

		System.out.println("Digits: " + digit1 + " " + digit2 + " " + digit3);

		// Addition of all digits
		int sum = digit1 + digit2 + digit3;
		System.out.println("Sum of digits: " + sum);

		// Display digits in reverse order
		System.out.println("Reverse order: " + digit3 + " " + digit2 + " " + digit1);

		// Display maximum and minimum digit
		int max = Math.max(digit1, Math.max(digit2, digit3));
		int min = Math.min(digit1, Math.min(digit2, digit3));
		System.out.println("Maximum digit: " + max);
		System.out.println("Minimum digit: " + min);
	}
}
