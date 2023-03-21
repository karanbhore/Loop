package practise;

public class DigitManipulation1 {
	public static void main(String[] args) {
		int num = 123;
		int digit1 = num / 100;
		int digit2 = (num / 10) % 10;
		int digit3 = num % 10;

		System.out.println("Digits:" + digit1 + " " + digit2 + " " + digit3);

		int sum = digit1 + digit2 + digit3;
		System.out.println("Sum"+" "+sum);

		System.out.println("Revers Order:" + digit3 + " " + digit2 + " " + digit1);

		int max = Math.max(digit1, Math.max(digit2, digit3));
		int min = Math.min(digit1, Math.max(digit2, digit1));
		System.out.println("MAX"+" "+max);
		System.out.println("MIN"+" "+min);

	}

}
