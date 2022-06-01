package com.kodytechnolab;
public class PatternPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>0;i--)
		{
			for(int k=5-i;k>=0;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
