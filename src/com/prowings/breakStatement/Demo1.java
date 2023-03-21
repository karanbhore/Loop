package com.prowings.breakStatement;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] values = new int[10];
		while (count < 10) {
			System.out.println("Enter a positive number : ");
			int num = sc.nextInt();
			if (num >= 0) {
				values[count] = num;
				count++;
			} else {
				System.out.println("Negetive num not accepted.Try again.");

			}
		}
		sc.close();

	}
}
