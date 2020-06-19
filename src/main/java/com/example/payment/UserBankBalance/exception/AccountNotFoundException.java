package com.example.payment.UserBankBalance.exception;

@SuppressWarnings("serial")
public class AccountNotFoundException extends RuntimeException{

	public AccountNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AccountNotFoundException(int account_no) {
		super("Account doesn't exist against: " + account_no);
		// TODO Auto-generated constructor stub
	}

	

}
