package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	static Scanner input = new Scanner(System.in);

	/*** UC-1 :- As a User need to enter a valid First Name. ***/
	public static void firstNameValidation() {
		System.out.print("Enter First Name :- ");
		String first_name = input.nextLine();

		String firstNameRegex = "^[A-Z][A-Z a-z]{3,}$"; // first character is Upper case an remaining all either Upper
														// or Lower

		Pattern pattern = Pattern.compile(firstNameRegex);

		Matcher matcher = pattern.matcher(first_name);

		System.out.println("First name pattern matching :- " + matcher.matches());
	}

	/**** Main Method ****/
	public static void main(String[] args) {
		/*** Displayed Welcome Message ***/
		System.out.println("---------------WELCOME TO USER REGISTRATION PROBLEM---------------\n");

		firstNameValidation();
	}
}
