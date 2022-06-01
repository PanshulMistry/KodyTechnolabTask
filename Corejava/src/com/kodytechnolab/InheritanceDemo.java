package com.kodytechnolab;
class Person {
	String name;
	String address;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Student extends Person {
	int rollno;

	public int getRollNo() {
		return rollno;
	}

	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Panshul");
		s.setAddress("1234");
		s.setRollNo(4021);
		String name = s.getName();
		String address = s.getAddress();
		int rno = s.getRollNo();
		System.out.println(name);
		System.out.println(address);
		System.out.println(rno);
	}

}
