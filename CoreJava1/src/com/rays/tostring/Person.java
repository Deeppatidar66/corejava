package com.rays.tostring;

public class Person {
	
	private int age = 0;
	private String name = null;
	
	public Person (int age, String name) {
		this.age= age;
		this.name=name;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		
		return (age+" "+name);
	}
	

}
