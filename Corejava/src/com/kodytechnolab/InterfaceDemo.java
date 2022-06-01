package com.kodytechnolab;
interface Display
{
	void display();
}
class A implements Display
{
	public void display()
	{
		System.out.println("Hello A");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		A a = new A();
		a.display();
	}

}
