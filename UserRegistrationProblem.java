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
		
		String firstNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower 
		
		Pattern pattern = Pattern.compile(firstNameRegex);
		
		Matcher matcher = pattern.matcher(first_name);
		
		System.out.println("First name pattern matching :- " + matcher.matches());
	}
	
	/*** UC-2 :- As a User need to enter a valid Last Name. ***/
	public static void lastNameValidation() {
		System.out.print("\nEnter last Name :- ");
		String last_name = input.nextLine();
		
		String lastNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower 
		
		Pattern pattern = Pattern.compile(lastNameRegex);
		
		Matcher matcher = pattern.matcher(last_name);
		
		System.out.println("Last name pattern matching :- " + matcher.matches());
	}
	
	/*** UC-3:- As a User need to enter a valid email. ***/
	public static void emailValidation() {
		System.out.print("\nEnter E-Mail :- ");
		String email = input.nextLine();
		
		String emailRegex = "^[\\w+-]+(\\.[\\w+-]+)*@[\\w]+(\\.[\\w]+)?(?=(\\.[A-Za-z_]{2,3}$|\\.[a-zA-Z]{2,3}$)).*$";       //email validation using regular expressions.
	
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		
		System.out.println("E-Mail pattern matching :- " + matcher.matches());
	}
	
	/*** UC-4:- As a User need to follow pre defined Mobile Format. ***/
	public static void mobileNumberValidation() {
		System.out.print("\nEnter mobile number with country code :- ");
		String mobileNum = input.nextLine();
		
		String mobileNumRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$";     //example:- 91 XXXXXXXXXX  mobile number format validation.
	
		Pattern pattern = Pattern.compile(mobileNumRegex);
		Matcher matcher = pattern.matcher(mobileNum);
		
		System.out.println("Mobile number pattern matching :- " + matcher.matches());
	}
	
	/*** UC-5:- As a User need to follow pre-defined Password rules. RULE-1:- minimum 8 Characters. ***/
	public static void passwordValidation() {
		System.out.println("\nEnter a password with 8 minimum characters :- ");
		String password = input.nextLine();
		
		String passwordRegex = "^[A-Za-z0-9]{8,}$";      //RULE:-1 :- minimum 8 characters.
		
		Pattern pattern = Pattern.compile(passwordRegex);
		
		Matcher matcher = pattern.matcher(password);
		
		System.out.println("Password Validation :- " + matcher.matches());
	
	} 
	
	/**** Main Method ****/
	public static void main(String[] args) {
		/*** Displayed Welcome Message ***/
		System.out.println("---------------WELCOME TO USER REGISTRATION PROBLEM---------------\n");
	
		firstNameValidation();

		lastNameValidation();
		
		emailValidation();
		
		mobileNumberValidation();
		
		passwordValidation();
	}
}
