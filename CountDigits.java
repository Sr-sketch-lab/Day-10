package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=scanner.nextInt();
		int count=0;
		while(number!=0) { 
			number/=10;
			count++;
		}
		System.out.println("The count of Digits in a Given Number is:"+count);
		scanner.close();

	}

}
