package practise;

import java.math.BigInteger;

public class Factorial {
	public static void main(String[] args) {
		int n = 30, i;
		BigInteger facto = BigInteger.ONE;

		for (i = 1; i <= n; ++i) {
			facto = facto.multiply(BigInteger.valueOf(i));
		}
		System.out.println(facto);

	}

}
