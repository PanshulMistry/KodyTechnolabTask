package com.kodytechnolab;
import java.util.*;
/*
 * Write a program to create a calculator and while choosing a choice the user has to
 * enter a operator to do a operation on the numbers. 
 */
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1, number2, result = 0;
		//Taking input from the user for number 1
		System.out.println("Enter your First Number:");
		number1 = sc.nextInt();
		//Taking input from the user for number 2
		System.out.println("Enter your Second Number:");
		number2 = sc.nextInt();
		String choice = "";
		while (true) {
			System.out.println("Please choose below your operator to do the operation on numbers:");
			System.out.println("1)+\n2)-\n3)*\n4)/");
			System.out.println("Enter choice operator for operation or 'q' to exit:");
			choice = sc.next();
			//If user enters the choice as q,the loop will break
			if (choice == "q") {
				break;
			}
			switch (choice) {
			case "+":
				result = number1 + number2;
				System.out.println("The Answer for your selected operation is:" + result);
				break;
			case "-":
				result = number1 - number2;
				System.out.println("The Answer for your selected operation is:" + result);
				break;
			case "*":
				result = number1 * number2;
				System.out.println("The Answer for your selected operation is:" + result);
				break;
			case "/":
				if (number2 != 0) {
					result = number1 / number2;
					System.out.println("The Answer for your selected operation is:" + result);
					break;
				} else {
					System.out.println("Cannot divide by 0.");
					break;
				}
			case "q":
				System.exit(0);
			}
		}
	}
}
