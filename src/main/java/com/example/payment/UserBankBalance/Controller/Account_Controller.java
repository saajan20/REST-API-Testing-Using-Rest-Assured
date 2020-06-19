package com.example.payment.UserBankBalance.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.payment.UserBankBalance.model.Transaction_History;
import com.example.payment.UserBankBalance.model.account;
import com.example.payment.UserBankBalance.repository.account_repository;
import com.example.payment.UserBankBalance.service.account_service;

@RestController
@RequestMapping("/Account")

public class Account_Controller {


@Autowired
account_service serve;

	@GetMapping("/{id}")
	public account getDetails(@PathVariable int id)
	{
	
	    return serve.get_Details_service(id);
	}
	
	
	@PostMapping("")
	public void postDetails(@RequestBody account data)
	{
	
	   serve.post_Details_service(data);
	}
	
	@PutMapping("/update")
	public void putDetails(@RequestBody account data)
	{
	
	   serve.put_Details_service(data);
	}

}
