package com.cloning;

public class Student implements Cloneable {
	int rollNo;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.address = (Address)address.clone();
		return student;
	}

}
