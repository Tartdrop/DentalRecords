package com.postgresql.dental.models;

public class AuthenticationResponse {
	 private String message;

	    public AuthenticationResponse(String message) {
	        this.message = message;
	    }

	    // Getter
	    public String getMessage() {
	        return message;
	    }
}
