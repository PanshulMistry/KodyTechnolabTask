package com.kodytechnolab;

import java.util.Scanner;
/**
 * 
 * @Objective Remove same word in sentence. Take input about how many sentence  user  will enter  

			  Sample Input
			  Enter number of sentence  : 5
			  Goodbye bye bye world world world
			  Sam went went to to to his business
			  Reya is is the the best player in eye eye game
			  in inthe
			  Hello hello Ab aB

			  Sample Output
			  Goodbye bye world
			  Sam went to his business
			  Reya is the best player in eye game
			  in inthe
			  Hello Ab
 * @Developer Panshul Mistry
 */
public class RemoveDuplicateWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s;
		//Taking number of sentences to be entered by the user
		System.out.println("Enter the number of sentences:");
		s = Integer.parseInt(sc.nextLine());
		String a1 = "";
		String[] a = new String[s];
		//Taking the sentences from the user
		System.out.println("Enter " + s + " sentences:");
		for (int i = 0; i < s; i++) {
			a[i] = sc.nextLine();
		}
		for (int i = 0; i < s; i++) {
			System.out.println(a[i] + " " + i);
		}
		String[] a2 = new String[50];
		String op = "";
		for (int i = 0; i < s; i++) {
			//Splitting the sentence words in a array
			a2 = a[i].split(" ");
			for (int j = 0; j < a2.length; j++) {
				for (int k = j + 1; k < a2.length; k++) {
					//If we get same word replace the second compared word with 'p'
					if (a2[j].equalsIgnoreCase(a2[k])) {
						a2[k] = "p";
					} else {
						continue;
					}
				}
			}
			for (int f = 0; f < a2.length; f++) {
				//if we get 'p' from the array ignore it and print else words
				if (a2[f].equals("p")) {
					continue;
				} else {
					//Storing the unique words in a string
					op = op + a2[f] + " ";
				}
			}
			//Storing the string in a array 
			a[i] = op;
			op = "";
			System.out.println();
		}
		System.out.println("After removing duplication:");
		for (int i = 0; i < s; i++) {
			System.out.println(a[i]);
		}
	}
}
