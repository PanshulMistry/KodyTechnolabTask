package com.kodytechnolab;
/*
 * Write a program to find prime numbers between 1 to 100. 
 */
public class Prime {

	public static void main(String[] args) {
		System.out.println("Prime Numbers between 1 to 100:");
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}

}
