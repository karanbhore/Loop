package practise;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 20;
		int a = 0, b = 1;
		System.out.println("Fibonacci Series of " + n + "numbers :");

		for (int i = 1; i <= n; ++i) {
			System.out.println(a + " ");
			int sum = a + b;
			a = b;
			b = sum;

		}

	}

}
