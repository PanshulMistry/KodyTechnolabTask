package com.kodytechnolab;
class A1
{
	void display()
	{
		System.out.println("A");
	}
}

public class RunTimePoly extends A1 {
	void display()
	{
		System.out.println("B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new RunTimePoly();
		a.display();
		
	}

}
