package com.fis.loan.controller;



import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.loan.bean.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {
	
	@GetMapping ("/{number}")
	public Loan getLoanDetails(@PathVariable long number)
	{
		return new Loan(6463562565382l, "car",400000,3856,18);
	}

}
