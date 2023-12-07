package com.bridgelabz;

/*
@Desc: InvalidInputException is a custom exception child class which
inherits a Exception class .
 **/
public class InvalidInputException extends Exception {
    public InvalidInputException (String message)
    {
        super(message);
    }
}
