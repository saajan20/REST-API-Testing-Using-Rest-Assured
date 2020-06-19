package com.example.payment.UserBankBalance.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payment.UserBankBalance.exception.AccountNotFoundException;
import com.example.payment.UserBankBalance.model.account;
import com.example.payment.UserBankBalance.repository.account_repository;

@Service
public class account_service {

	@Autowired
	account_repository repo;
	
	public account get_Details_service(int id)
	{
		return repo.findById(id).orElseThrow(()-> new AccountNotFoundException(id) );
	}

	public void post_Details_service(account data) {
		
		repo.save(data);
	}

	public void put_Details_service(account data) {
	
	  account new_data = repo.findById(data.getAccount_id()).orElseThrow(null);
	  new_data.setAccount_balance(data.getAccount_balance());
	  repo.save(new_data);
		
	}
	
	
	
}
