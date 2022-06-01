package com.kodytechnolab;
import java.util.Scanner;
/*
 * Write a program to find palindrome of a string. 
 */
public class Palindrome{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letter = "";
		//Taking word from the user
		System.out.println("Enter the String:");
		letter = sc.next();
		int end = letter.length();
		String rev = "";
		//Reversing the string 
		for (int i = end - 1; i >= 0; i--) {
			rev = rev + letter.charAt(i);
		}
		System.out.println(rev);
		if (letter.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}

	}

}
