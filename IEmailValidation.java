package com.bridgelab;

@FunctionalInterface
public interface IEmailValidation {
	public boolean emailValidation(String email) throws UserRegistrationException;

}