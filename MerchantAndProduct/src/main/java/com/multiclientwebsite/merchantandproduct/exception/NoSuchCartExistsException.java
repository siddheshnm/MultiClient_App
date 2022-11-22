package com.multiclientwebsite.merchantandproduct.exception;

public class NoSuchCartExistsException extends Exception {
    private static final long serialVersionUID = 1L;

    public NoSuchCartExistsException() {

    }

    public NoSuchCartExistsException(String message) {
        super(message);
    }
}
