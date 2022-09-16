package com.bridgelab;

@FunctionalInterface
public interface IMobileNumValidation {
	public boolean mobileNumberValidation(String mobileNum) throws UserRegistrationException;

}