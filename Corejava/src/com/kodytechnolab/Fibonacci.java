package com.kodytechnolab;
/**
 * 
 * @Objective Write a program to print the Fibonacci Series form 1 to 100.
 * @Developer Panshul Mistry
 */
public class Fibonacci{
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int result;
		System.out.println("Fibonacci Series:");
		System.out.print(number1 + " ");
		System.out.print(number2 + " ");
		for (int i = 2; i <= 100; i++) {
			result = number1 + number2;
			if (result >= 100) {
				break;
			}
			System.out.print(result + " ");
			number1 = number2;
			number2 = result;
		}

	}

}
