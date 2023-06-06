package com.prosky.fundamentalsalgorithmspart1.service;

public class ElementMissingException extends RuntimeException {
    public ElementMissingException(String massage) {
        super(massage);
    }
}
