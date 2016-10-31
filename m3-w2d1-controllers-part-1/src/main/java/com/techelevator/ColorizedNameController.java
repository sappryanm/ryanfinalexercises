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
		
		 String colorSelector = request.getParameter("colorSelector");

		switch (colorSelector){
			case "red": colorSelector = ("color:red;");break;
			case "blue": colorSelector = ("color:blue;");break;
			case "green":  colorSelector = ("color:green;");break;

			default:System.out.println("Missing name part"); 
		}
			
		
		request.setAttribute("colorSelector", colorSelector);
		return "colorizedNameResults";
	}
}