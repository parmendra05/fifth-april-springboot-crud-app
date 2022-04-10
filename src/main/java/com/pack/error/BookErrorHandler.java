package com.pack.error;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BookErrorHandler {

	@ExceptionHandler
	public ResponseEntity<Object> entityErrorHandler(MethodArgumentNotValidException ex) {

		HashMap<String, String> errorlist = new HashMap<>();

		ex.getBindingResult().getAllErrors().forEach(error -> {

			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();

			errorlist.put(fieldName, message);
		}

		);

		return new ResponseEntity<>(errorlist, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<Object> BookNotFoundHandler(BookNotFoundException ex) {

		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
