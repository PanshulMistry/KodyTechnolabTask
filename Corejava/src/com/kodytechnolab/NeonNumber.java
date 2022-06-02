package com.kodytechnolab;
import java.util.Scanner;
/**
 * 
 * @Objective Write a program to find that the number is a Neon number or not.
 * @Developer Panshul
 */
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		//Taking the input number from user.
		System.out.println("Enter the number:");
		number = sc.nextInt();
		//Performing square of a number 
		int square = number * number;
		int number1 = square;
		int remainder = 0;
		int sum = 0;
		//Finding the sum of square of digits
		while (number1 > 0) {
			remainder = number1 % 10;
			sum = sum + remainder;
			number1 = number1 / 10;
		}
		if (number == sum) {
			System.out.println(number + " is a Neon Number.");
		} else {
			System.out.println(number + " is not a Neon Number.");
		}
	}

}
