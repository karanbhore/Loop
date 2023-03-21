package practise;

import java.util.Scanner;
import java.math.*;

public class ScannerFactorial {
	public static void main(String[] args) {

		BigInteger factorial = BigInteger.ONE;
		int i, n;

		Scanner in = new Scanner(System.in);
		System.out.println("enter n");
		n = in.nextInt();

		for (i = 1; i <= n; ++i) {
			factorial = factorial.multiply(BigInteger.valueOf(i));

		}
		System.out.println(factorial);

		in.close();	

	}
	
	
}
