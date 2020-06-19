package com.example.payment.UserBankBalance.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.payment.UserBankBalance.model.Error_Response;

@ControllerAdvice
public class Exception_Handler {
		
	
			@ExceptionHandler(AccountNotFoundException.class)
			public ResponseEntity<Error_Response> handleApiRequestException(AccountNotFoundException ex)
			{
				
				Error_Response res=new Error_Response(ex.getMessage(), ex , HttpStatus.BAD_REQUEST ,ZonedDateTime.now(ZoneId.of("Z")));
				return new ResponseEntity<Error_Response>(res,HttpStatus.BAD_REQUEST);
				
			}
	
	
}
