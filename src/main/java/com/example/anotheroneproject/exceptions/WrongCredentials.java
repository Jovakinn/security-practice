package com.example.anotheroneproject.exceptions;


public class WrongCredentials extends RuntimeException {
    public WrongCredentials(String message, Throwable cause) {
        super(message, cause);
    }
}
