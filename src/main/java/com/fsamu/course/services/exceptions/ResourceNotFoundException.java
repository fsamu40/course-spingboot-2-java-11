package com.fsamu.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Rsource not found. Id " + id);
	}
}
