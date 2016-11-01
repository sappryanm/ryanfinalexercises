package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderedNameController {


	
	@RequestMapping("/orderedName")
	public String handleAlienWeight(){
		
		
		return "orderedName";
	}
	
	@RequestMapping("/orderedNameResults")
	public String handleAlienWeightResult(HttpServletRequest request){
		
		List<String> nameList = new ArrayList<String>();
		
		String first = request.getParameter("firstName");
		String mi = request.getParameter("middleName");
		String last = request.getParameter("lastName");
		
		 String orderFormat = request.getParameter("nameOrder");

		switch (orderFormat){
			case "firstMiLast": orderFormat = (first + " " + mi + " " + last );break;
			case "firstLast": orderFormat = (first + " " + last );break;
			case "lastFirstMi":  orderFormat = (last + ", " + first + " " + mi);break;
			case "lastFirst":  orderFormat = (last + ", " + first);break;
			default:System.out.println("Missing name part"); 
		}
			
		
		request.setAttribute("orderFormat", orderFormat);
		return "orderedNameResults";
	}
}