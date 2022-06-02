package com.kodytechnolab;
import java.util.Scanner;
/**
 * 
 * @Objective Write a program to find whether the number is a spy number or not.
 * @Developer Panshul Mistry
 */
public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number:");
		number = sc.nextInt();
		int number1 = number;
		int remainder = 0;
		int sum = 0;
		int product = 1;
		while (number1 > 0) {
			remainder = number1 % 10;
			sum = sum + remainder;
			product = product * remainder;
			number1 = number1 / 10;
		}
		if (sum == product) {
			System.out.println(number + " is a Spy Number.");
		} else {
			System.out.println(number + " is not a Spy Number.");
		}
	}

}
