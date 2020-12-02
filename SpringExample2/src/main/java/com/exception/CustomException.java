package com.exception;

import org.springframework.stereotype.Component;

@Component("customException")
public class CustomException extends Exception {
	public CustomException(String s) {
		super(s);
	}

}
