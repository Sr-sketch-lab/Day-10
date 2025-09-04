package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=scanner.nextInt();
		int original=number;
		int reverse=0;
		while (number!=0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
		}
		if(original==reverse) {
			System.out.println(original+"is a Palindrome Number");
		}else {
			System.out.println(original+" is Not a Palindrome Number");
		}
		scanner.close();
	}

}
