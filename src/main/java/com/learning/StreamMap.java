package com.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.learning.model.Gender;
import com.learning.model.Person;

public class StreamMap {

	public static void main(String args[]) {
		Map<Integer, Person> personMap = new HashMap<Integer, Person>();

		Person personOne = new Person(10, "John", Gender.MALE);
		Person personTwo = new Person(11, "Andy", Gender.MALE);
		Person personThree = new Person(12, "Peter", Gender.MALE);
		Person personFour = new Person(13, "Sarah", Gender.FEMALE);
		Person personFive = new Person(14, "Gillian", Gender.FEMALE);

		personMap.put(personOne.getAge(), personOne);
		personMap.put(personTwo.getAge(), personTwo);
		personMap.put(personThree.getAge(), personThree);
		personMap.put(personFour.getAge(), personFour);
		personMap.put(personFive.getAge(), personFive);

		// Find all Person Objects where Age is Even
		System.out.println("Persons with Even Age - " + personMap.entrySet().stream().filter(person -> person.getKey() % 2 == 0)
				.map(Map.Entry::getValue).collect(Collectors.toList()));

		// Find all Person Objects where Gender is Female
		System.out.println("Persons with Gender Female - " + personMap.values().stream().filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList()));

	}
}
