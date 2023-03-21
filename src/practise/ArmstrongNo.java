package practise;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a no :");

		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int digits = String.valueOf(n).length();

		while (temp != 0) {
			int lastDigit = temp % 10;
			sum = sum + (int) Math.pow(lastDigit, digits);
			temp = temp / 10;

		}
		if (n == sum) {
			System.out.println(n + " " + "Armstrong no");
		} else
			System.out.println(n + " " + "Not Armstrong No");

	}

}
