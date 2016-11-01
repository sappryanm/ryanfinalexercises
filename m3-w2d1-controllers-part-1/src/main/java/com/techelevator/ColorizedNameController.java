package com.techelevator;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColorizedNameController {


	
	@RequestMapping("/colorizedName")
	public String handleAlienWeight(){
		
		
		return "colorizedName";
	}

	@RequestMapping("/colorizedNameResults")
	public String handleAlienWeightResult(HttpServletRequest request){
		
		List<String> nameList = new ArrayList<String>();
		
		String first = request.getParameter("firstName");
		String last = request.getParameter("lastName");
		String fullname = request.getParameter("lastName") + request.getParameter("firstName");

		//String colorSelector = request.getParameter("colorSelector");
		
		 String colorSelector[] = request.getParameterValues("colorSelector"); 
//		 if (select != null && select.length != 0) {
//			System.out.println("You have Selected nothing");
//		 }for (int i = 0; i < select.length; i++) {
//			 	
//			 //System.out.println(select[i]); 
////		 }
//		switch (colorSelector){
//			case "red": colorSelector = ("red;");break;
//			case "blue": colorSelector = ("blue;");break;
//			case "green":  colorSelector = ("green;");break;
//
//			default:System.out.println("Missing name part"); 
//		}
//			
//		
//		request.setAttribute("colorSelector", colorSelector);
		return "colorizedNameResults";
	}
}