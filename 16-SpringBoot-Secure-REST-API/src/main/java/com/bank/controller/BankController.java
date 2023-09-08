package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	@GetMapping("/balance")
	public String getBalance() {
		return "Your balance is 78945612 INR";
	}

	@GetMapping("/home")
	public String home() {
		return "This is home Page";
	}

	@GetMapping("/statement")
	public String getStatement() {
		return "Your statement is sent to your email";
	}
	
	@GetMapping("/contact")
	public String getContact() {
		return "Thank you for contacting support";
	}
	
	@GetMapping("/loan")
	public String getMyLoan() {
		return "Your loan amount is 78,452,25 INR";
	}
}
