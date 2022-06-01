package com.kodytechnolab;
class Add {
	int a, b, c;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class CompiletimePoly {

	public static void main(String[] args) {
		Add a = new Add();
		a.add(2, 3);
		a.add(1, 2, 3);
	}

}
