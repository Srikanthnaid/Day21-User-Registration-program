package com.bridgelab;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.user.registration.problem.Functional_Interfaces.IEmailValidation;
import com.user.registration.problem.Functional_Interfaces.IFirstNameValidation;
import com.user.registration.problem.Functional_Interfaces.ILastNameValidation;
import com.user.registration.problem.Functional_Interfaces.IMobileNumValidation;
import com.user.registration.problem.Functional_Interfaces.IPasswordValidation;

public class UserRegistrationProblem {
public IFirstNameValidation firstNameValidation = (String first_name) -> {
		
		String firstNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower 
		
		Pattern pattern = Pattern.compile(firstNameRegex);
		
		Matcher matcher = pattern.matcher(first_name);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_FIRST_NAME + " Please enter a valid input.");
		}
	};
	
	/*** UC-2 :- As a User need to enter a valid Last Name. ***/
	public ILastNameValidation lastNameValidation = (String last_name) -> {
		
		String lastNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower 
		
		Pattern pattern = Pattern.compile(lastNameRegex);
		
		Matcher matcher = pattern.matcher(last_name);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_LAST_NAME + " Please enter a valid input.");
		}
	};
	
	/*** UC-9:- Should clear all email samples provided separately. ***/
	public IEmailValidation emailValidation = (String email) -> {
		
		String emailRegex = "^[\\w+-]+(\\.[\\w+-]+)*@[\\w]+(\\.[\\w]+)?(?=(\\.[A-Za-z_]{2,3}$|\\.[a-zA-Z]{2,3}$)).*$";       //UC-9:- All email validations using regular expressions.
	
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_EMAIL + " Please enter a valid input.");
		}
	};
	
	/*** UC-4:- As a User need to follow pre defined Mobile Format. ***/
	public IMobileNumValidation mobileNumberValidation = (String mobileNum) -> {
		
		String mobileNumRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$";     //example:- 91 XXXXXXXXXX  mobile number format validation.
	
		Pattern pattern = Pattern.compile(mobileNumRegex);
		Matcher matcher = pattern.matcher(mobileNum);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_MOBILE_NUMBER + " Please enter a valid input.");
		}
	};
	
	/*** UC-8:- As a User need to follow pre-defined Password rules. Rule-4:- Has exactly 1 Special Character. ***/
	public IPasswordValidation passwordValidation = (String password) -> {
		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=[\\w]*[\\W][\\w]*$)(?=.*[a-z]).{8,}$";      //Rule-4:-  Has exactly 1 Special Character.
		
		Pattern pattern = Pattern.compile(passwordRegex);
		
		Matcher matcher = pattern.matcher(password);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_PASSWORD + " Please enter a valid input.");
		}
	};
}
