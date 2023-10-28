package com.example.dashboard.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClienteNaoEncontradoException extends RuntimeException{
	
	private static final long serialVersionUID = 90074859347500447L;

	public ClienteNaoEncontradoException(String message) {
		super(message);
	}
}
