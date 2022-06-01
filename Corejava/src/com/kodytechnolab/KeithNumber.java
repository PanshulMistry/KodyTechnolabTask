package com.kodytechnolab;
import java.util.Scanner;
/*
 * Write a program to find that the number is a Keith number or not.
 */ 
public class KeithNumber {

	public static void main(String[] args) {
		int number = 0, sum = 0, number1, i = 0, remainder, count = 0;
		int[] arr = new int[20];
		Scanner sc = new Scanner(System.in);
		//Taking number from the user
		System.out.println("Enter a Number: ");
		number = sc.nextInt();
		number1 = number;
		int number2 = number;
		while (number1 > 0) {
			remainder = number1 % 10;
			count++;
			number1 = number1 / 10;
		}
		System.out.println("Count is:" + count);
		//Storing all the digits in an array
		while (number2 > 0) {
			remainder = number2 % 10;
			arr[i] = remainder;
			i++;
			number2 = number2 / 10;
		}
		int k = 0;
		for (int j = 0; j < 20; j++) {
			//if we get our sum same as the number we break the loop
			if (sum == number) {
				break;
			} else {
				sum = 0;
				//Doing the sum of digits
				for (k = 0; k < count; k++) {
					sum = sum + arr[k];
				}
				System.out.println("Sum is:" + sum);
				//Replacing the last element of the array as sum 
				for (k = count - 1; k >= 0; k--) {
					if (k == 0) {
						break;
					}
					arr[k] = arr[k - 1];
				}
				arr[k] = sum;
			}
		}
		if (sum == number) {
			System.out.println("Keith Number");
		} else {
			System.out.println("Not a Keith Number");
		}
	}
}