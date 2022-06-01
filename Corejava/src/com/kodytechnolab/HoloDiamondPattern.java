package com.kodytechnolab;
/*
 *Draw the below mentioned pattern: 
 *   A 
    B B 
   C   C 
  D     D 
 E       E 
F         F 
 E       E 
  D     D 
   C   C 
    B B 
     A 
 */
public class HoloDiamondPattern {
	public static void main(String[] args) {
		int l = 65;
		//Triangle part 1
		//i for the rows
		for (int i = 0; i < 6; i++) {
			//k for printing the spaces
			for (int k = 1; k < 6 - i; k++) {
				System.out.print(" ");
			}
			//j for printing the alphabets
			for (int j = 0; j <= i; j++) {
				/*Printing the first and the last alphabet as per the row else 
				printing spaces*/
				if (j == 0 || j == i) {
					System.out.print((char) (l + i) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//Triangle Part 1 end
		//Triangle Part 2 
		for (int i = 4; i >= 0; i--) {
			for (int k = 4 - i; k >= 0; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					System.out.print((char) (l + i) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//Traingle Part 2 end
	}
}
