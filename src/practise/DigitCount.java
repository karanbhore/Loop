package practise;

public class DigitCount {
	public static void main(String[] args) {
		int n = 1203456789, count = 0;

		while (n > 0) {
			n /= 10;
			count++;
		}
		System.out.println(count);

	}

}
