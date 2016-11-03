package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SqurrielPartyController {


	
	@RequestMapping("/cigarParty")
	public String handleSqurrielPArty(){
		
		
		return "cigarParty";
	}
	
	@RequestMapping("/cigarPartyResult")
	public String handleCigarPartyResult(HttpServletRequest request){
		
	//	List<String> nameList = new ArrayList<String>();
		
		String number = request.getParameter("numberSqurriels");
		int numberInt = Integer.parseInt(number);
		String weekend = request.getParameter("weekend");

		//boolean weekendB = weekend != null;
		//System.out.println(weekendB);
		//String last = request.getParameter("lastName");
		String party = ("party is a success");
		String partyBad = ("party is a Failure");
		String partyImage = ("img/happy-squirrel.png");
		String partyImageBad = ("img/sad-squirrel.png");
		if(weekend == "true" && numberInt > 0) {
			request.setAttribute("party", party);
			request.setAttribute("partyImage", partyImage);
		}else if  (weekend != "weekend" && numberInt >= 40 && numberInt <= 60){
			request.setAttribute("party", party);
			request.setAttribute("partyImage", partyImage);
		}
		else if (weekend != "weekend") {
			request.setAttribute("partyBad", partyBad);
			request.setAttribute("partyImageBad", partyImageBad);
		}


			

		return "cigarPartyResult";
	}
}