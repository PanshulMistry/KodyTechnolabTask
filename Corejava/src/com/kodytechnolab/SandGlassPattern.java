package com.kodytechnolab;
/*
 * Draw the below mentioned pattern:
 *1 2 3 4 5 6 7 
   2 3 4 5 6 7 
    3 4 5 6 7 
     4 5 6 7 
      5 6 7 
       6 7 
        7 
       6 7 
      5 6 7 
     4 5 6 7 
    3 4 5 6 7 
   2 3 4 5 6 7 
  1 2 3 4 5 6 7 
 
 */
public class SandGlassPattern {

	public static void main(String[] args) {
		//Triangle part 1
		//i for the rows
		for (int i = 0; i < 7; i++) {
			//k for printing the spaces
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			//j for printing the numbers as per the rows
			for (int j = (i + 1); j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//Triangle part 1 end
		//Triangle part 2 
		for (int i = 6; i > 0; i--) {
			for (int k = i - 1; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = i; j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//Triangle part 2 en
	}
}
