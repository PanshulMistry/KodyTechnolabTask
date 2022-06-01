package com.kodytechnolab;
class Bike {
	protected void run() {
		System.out.println("running");
	}
}

public class MethodOverride extends Bike {
	protected void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String[] args) {
		Bike b = new MethodOverride();
		b.run();

	}

}
