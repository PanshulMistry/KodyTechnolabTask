package com.kodytechnolab;
import java.util.Scanner;

/**
 * 
 * @Objective Given an integer, n, perform the following conditional actions:
 If n  is odd, print Weird
 If n  is even and in the inclusive range of  2 to 5 , print Not Weird
 If n  is even and in the inclusive range of  6 to 20 , print Weird
 If n  is even and greater than 20, print Not Weird

Input Format
A single line containing a positive integer, n.

output Format
Print Weird if the number is weird; otherwise, print Not Weird.
 
Sample Input 
3

Sample Output 
Weird
 * @Developer Panshul Mistry
 */
public class WeirdNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number:");
		number = sc.nextInt();
		if (number % 2 != 0) {
			System.out.println("Weird");
		}
		if (number % 2 == 0) {
			if (number >= 2 && number <= 5) {
				System.out.println("Not weird");

			} else if (number >= 6 && number <= 20) {
				System.out.println("weird");
			} else if (number > 20) {
				System.out.println("Not weird");

			}
		}
	}

}
