package com.pack.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BookErrorHandler {

	@ExceptionHandler
	public Map<String, String> entityErrorHandler(MethodArgumentNotValidException ex){
		
		HashMap<String, String> errorlist=new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach( error -> {
			
			String fieldName=((FieldError)error).getField();
			String message=error.getDefaultMessage();
			
			errorlist.put(fieldName, message);
		}
				
				);
		
		return errorlist;
	}
	
}
