package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		int sum=0;
		while(number!=0) { 
			int digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("The sum of digits is:"+sum);
		scanner.close();
	}
}
