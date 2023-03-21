package practise;

import java.util.Scanner;

public class PositiveNegetive {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		System.out.println("enter 10 num");
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("positive numbers");
		for (int n : num) {
			if (n > 0) {
				System.out.println(n + " ");
			}
		}
		System.out.println("negetive numbers");
		for (int n : num) {
			if (n < 0) {
				System.out.println(n + " ");
			}

		}
		sc.close();

	}

}
