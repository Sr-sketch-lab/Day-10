package com.codegnan.controlstatements;

import java.util.Scanner;

public class Canteensystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teaPrice = 10, coffeePrice = 15, samosaPrice = 20;
		int teaQty = 0, coffeeQty =0,samosaQty=0;
		int choice;
		double taxRate=0.05;
		do {
			System.out.println("========Canteen Menu=========||");
			System.out.println("========1. View Menu==========||");
			System.out.println("========2. Order Items=========||");
			System.out.println("========3. View Bill===========||");
			System.out.println("========4. Checkout and Exit==========||");
			System.out.println("Enter your Choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("=========MENU========");
				System.out.println(" 1. Tea- $"+teaPrice);
				System.out.println(" 2. Coffee- $"+coffeePrice);
				System.out.println(" 3. Samosa- $"+samosaPrice);
				break;
			case 2:
				System.out.println("Enter Item Number to Order (1-3)");
				int item=scanner.nextInt();
				System.out.println("Enter Quantity");
				int qty=scanner.nextInt();
				if(qty<=0) {
					System.out.println("Quantity must be greater than 0");
					break;
				}
				switch(item) {
				case 1:
					teaQty+=qty;
					System.out.println(qty+"Tea(s) Added");
					break;
				case 2:
					coffeeQty+=qty;
					System.out.println(qty+"Coffee(s) Added");
					break;
				case 3:
					samosaQty+=qty;
					System.out.println(qty+"samosa(s) Added");
					break;
					default:
						System.out.println("Invalid Item Number."+"Please choose between 1-3");
						break;
				}
				break;
			case 3:
				int teaTotal=teaQty*teaPrice;
				int coffeeTotal=coffeeQty*coffeePrice;
				int samosaTotal=samosaQty*samosaPrice;
				int subTotal= teaTotal+coffeeTotal+samosaTotal;
				double tax=taxRate*subTotal;
				double grandTotal=subTotal+tax;
				System.out.println("==========Bill========");
				if(teaQty>0) {
					System.out.println("Tea x: "+teaQty+" =$ "+teaTotal);
				}
				if(coffeeQty>0) {
					System.out.println(" Coffee x: "+coffeeQty+" =$ "+coffeeTotal);
				}
				if(samosaQty>0) {
					System.out.println("Samosa x: "+samosaQty+" =$ "+samosaTotal);
				}
				if(subTotal==0) {
					System.out.println("No Items Ordered Yet");
				}else {
					System.out.println("sub Total:"+subTotal);
					System.out.println("Tax (5%)"+tax);
					System.out.println("Total = "+ grandTotal);
				}
				break;
			case 4:
				System.out.println("Thankyou!.Existing System");
				break;
				default:
					System.out.println("In Valid Choice."+"Please Enter a Number from 1-4");
					break;
			}
		}while(choice!=4);
		scanner.close();
	}

}
