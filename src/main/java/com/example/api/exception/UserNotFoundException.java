package com.example.api.exception;

public class UserNotFoundException  extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}
