package com.bridgelab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	/*** UC-1 :- As a User need to enter a valid First Name. ***/
	public static boolean firstNameValidation(String first_name) {
		
		String firstNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower 
		
		Pattern pattern = Pattern.compile(firstNameRegex);
		
		Matcher matcher = pattern.matcher(first_name);
		
		return matcher.matches();
	}
	
	/*** UC-2 :- As a User need to enter a valid Last Name. ***/
	public static boolean lastNameValidation(String last_name) {
		
		String lastNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower 
		
		Pattern pattern = Pattern.compile(lastNameRegex);
		
		Matcher matcher = pattern.matcher(last_name);
		
		return matcher.matches();
	}
	
	/*** UC-9:- Should clear all email samples provided separately. ***/
	public static boolean emailValidation(String email) {
		
		String emailRegex = "^[\\w+-]+(\\.[\\w+-]+)*@[\\w]+(\\.[\\w]+)?(?=(\\.[A-Za-z_]{2,3}$|\\.[a-zA-Z]{2,3}$)).*$";       //UC-9:- All email validations using regular expressions.
	
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		
		return matcher.matches();
	}
	
	/*** UC-4:- As a User need to follow pre defined Mobile Format. ***/
	public static boolean mobileNumberValidation(String mobileNum) {
		
		String mobileNumRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$";     //example:- 91 XXXXXXXXXX  mobile number format validation.
	
		Pattern pattern = Pattern.compile(mobileNumRegex);
		Matcher matcher = pattern.matcher(mobileNum);
		
		return matcher.matches();
	}
	
	/*** UC-8:- As a User need to follow pre-defined Password rules. Rule-4:- Has exactly 1 Special Character. ***/
	public static boolean passwordValidation(String password) {
		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=[\\w]*[\\W][\\w]*$)(?=.*[a-z]).{8,}$";      //Rule-4:-  Has exactly 1 Special Character.
		
		Pattern pattern = Pattern.compile(passwordRegex);
		
		Matcher matcher = pattern.matcher(password);
		
	    return matcher.matches();
	} 
}
