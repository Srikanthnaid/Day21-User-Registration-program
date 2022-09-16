package com.bridgelab;

public class UserRegistrationException extends Exception {
	/** enum which extends Enum class **/
	enum type_of_exceptions {
		INVALID_FIRST_NAME,
		INVALID_LAST_NAME,
		INVALID_EMAIL,
		INVALID_MOBILE_NUMBER,
		INVALID_PASSWORD;
	}
	
	
	public UserRegistrationException(String message) {
		super(message);
	}
}
