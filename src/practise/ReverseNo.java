package practise;

public class ReverseNo {
	public static void main(String[] args) {
		int n = 123456;
		while (n > 0) {
			int digit = n % 10;
			System.out.print(digit);
			n = n / 10;

		}
	}

}
