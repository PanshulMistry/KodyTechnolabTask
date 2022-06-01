package com.kodytechnolab;
import java.util.Scanner;
/*
 * Write a program to find the factorial of a given number.
 *  
 */
public class Factorial {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		int factorial = 1;
		while (number > 0) {
			factorial = factorial * number;
			number--;
		}
		System.out.println("Factorial is:" + factorial);
	}

}
