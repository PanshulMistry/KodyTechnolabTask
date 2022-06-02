package com.kodytechnolab;
import java.util.Scanner;
/**
 * 
 * @Objective Write a program to find whether the number is a tech number or not 
 * @Developer Panshul
 * @Date 02-Jun-2022
 */
public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		//Taking input from the user
		System.out.println("Enter the number:");
		number = sc.nextInt();
		int number1 = number;
		int remainder = 0;
		int digit1 = 0;
		int sum = 0;
		int i = 0;
		String str = String.valueOf(number);
		//Finding the length of the number
		int length = Integer.valueOf(str.length());
		int[] arr = new int[length];
		//Adding the numbers into an array
		while (number1 > 0) {
			remainder = number1 % 10;
			arr[i] = remainder;
			i++;
			number1 = number1 / 10;
		}
		for (int j = 0; j < length; j++) {
			System.out.println(arr[j]);
		}
		int digit2 = 0; 
		int square;
		//Dividing the number in half to seperate even number of digits
		int mid = (arr.length / 2);
		for (int j = length - 1; j >= 0; j--) {
			if (j < mid) {
				digit1 = (digit1 * 10) + arr[j];
			} else {
				digit2 = (digit2 * 10) + arr[j];
			}
			sum = digit1 + digit2;
		}
		System.out.println("D1:" + digit1 + " " + "D2:" + digit2);
		System.out.println("Sum is:" + sum);
		square = sum * sum;
		if (square == number) {
			System.out.println("Tech Number");
		} else {
			System.out.println("Not a Tech Number");
		}

	}

}
