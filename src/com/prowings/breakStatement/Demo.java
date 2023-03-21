package com.prowings.breakStatement;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=100;i++) {
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		if(num>=500&&num<=600)
			break;
	}
	sc.close();
	System.out.println("Loop is terminated");

}

}
