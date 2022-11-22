package com.multiclientwebsite.merchantandproduct.exception;

public class NoSuchMerchantExistsException extends Exception {

    private static final long serialVersionUID = 1L;

    public NoSuchMerchantExistsException() {

    }

    public NoSuchMerchantExistsException(String message) {
        super(message);
    }

}
