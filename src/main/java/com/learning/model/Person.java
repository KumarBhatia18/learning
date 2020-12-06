package com.learning.model;

public class Person {

	private Integer age;
	
	private String name;
	
	private Gender gender;

	public Person() {
		super();
	}

	public Person(Integer age, String name, Gender gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return age + " " + name + " " + gender;
	}
}
