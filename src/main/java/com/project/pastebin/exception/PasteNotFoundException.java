package com.project.pastebin.exception;

public class PasteNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public PasteNotFoundException(String message) {
        super(message);
    }
}
