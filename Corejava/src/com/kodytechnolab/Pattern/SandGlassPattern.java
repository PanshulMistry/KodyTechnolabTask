package com.kodytechnolab.Pattern;
/**
 * 
 * @Objective Draw the below mentioned pattern:
  1 2 3 4 5 6 7 
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
 
 * @Developer Panshul Mistry
 */
public class SandGlassPattern {

	public static void main(String[] args) {
		//Triangle Upper part
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
		//Triangle Upper part end
		//Triangle Lower part 
		for (int i = 6; i > 0; i--) {
			for (int k = i - 1; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = i; j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//Triangle Lower part end
	}
}
