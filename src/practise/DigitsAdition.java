package practise;

public class DigitsAdition {
	public static void main(String[] args) {
		int n = 123456, sum = 0, digit;

		while (n > 0) {
			digit = n % 10;
			sum += digit;
			n /= 10;

		}
		System.out.println(sum);

	}

}
