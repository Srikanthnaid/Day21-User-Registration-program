package com.bridgelab;

@FunctionalInterface
public interface IPasswordValidation {
	public boolean passwordValidation(String password) throws UserRegistrationException;

}