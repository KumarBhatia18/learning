package com.learning;

public class PrintCharactersInString {

	public static void main(String args[]) {
		String inputString = "Nitin";

		for (int i = 0; i < inputString.length(); i++) {
			System.out.println("String at index " + i + " is " + inputString.charAt(i));
		}
	}
}
