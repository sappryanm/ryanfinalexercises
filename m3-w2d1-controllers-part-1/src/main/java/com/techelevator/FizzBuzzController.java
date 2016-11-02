package com.techelevator;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FizzBuzzController {


	
	@RequestMapping("/fizzBuzzRevisted")
	public String handleFizzBuzz(){
		
		
		return "fizzBuzzRevisted";
	}
	
	@RequestMapping("/fizzBuzzRevistedResult")
	public String handleFizzBuzztResult(HttpServletRequest request){
		
		
		return "fizzBuzzRevistedResult";
	}
	}