package com.kodytechnolab;
import java.util.Scanner;
/**
 * 
 * @Objective Write a program to Find that the number is Armstrong Number or not.
 * @Developer Panshul Mistry
 */
public class Armstrong {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		//Taking input from the user 
		System.out.println("Enter the number:");
		number = sc.nextInt();
		int remainder = 0;
		int armstrong = 0;
		int multiply = 1;
		int number1 = number;
		int count = 0;
		int no2 = number;
		
		//Counting the number of digits in the number
		
		while (no2 > 0) {
			remainder = no2 % 10;
			count++;
			no2 = no2 / 10;
		}
		System.out.println("count:" + count);
		/*Performing the multiplication of a digit as per the number of 
		digits counted. */
		while (number1 > 0) {
			remainder = number1 % 10;
			multiply = 1;
			for (int i = 0; i < count; i++) {
				multiply = multiply * remainder;
			}
			armstrong = armstrong + multiply;
			number1 = number1 / 10;
		}
		if (armstrong == number) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}
	}
}
