package com.techelevator;

import static org.mockito.Matchers.intThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BabyLottoController {


	
	@RequestMapping("/babylotto")
	public String handlebabylotto(){
		
		
		return "babylotto";
	}
	private int countMatches(Pattern pattern, String string)
	{
	    Matcher matcher = pattern.matcher(string);

	    int count = 0;
	    int pos = 0;
	    while (matcher.find(pos))
	    {
	        count++;
	        pos = matcher.start() + 1;
	    }

	    return count;
	}
	@RequestMapping("/babylottoResult")
	public String handlebabyweightResult(HttpServletRequest request){
		
		//List<String> nameList = new ArrayList<String>();
		List<String> tickets = Arrays.asList(request.getParameterValues("ticket"));
		List<String> colors = new ArrayList<String>();
		colors.add("black");
		colors.add("gray");
		colors.add("green");
		String[] ticketInput = request.getParameter("ticket").split(",");
		List<String[]> ticketList = Arrays.asList(ticketInput);
	}
        
//
//        for (int i = 0; i < first.length; i++)
//        {        
//            if(tickets.equals(first[0]) == tickets.equals(first[1]) == tickets.equals(first[2]))
//            {
//                colors.get(2);
//            } else if (tickets. {
//            	colors.get(2);
//            }
           
    

//		int[] firstInt = new int[first.length];
//		    for (int i=0; i < first.length; i++) {
//		        firstInt[i] = Integer.parseInt(first[i]);
//		    }

//		String[] innerArray=firstArray[0].split(",");
//		for (int i = 0; i < first.length; i++) {
//		String[] firstArray=first[i].split(",")
//		}
		
				
//		String orderFormat = request.getParameter("nameOrder");
//
//		switch (first[0,1,2]){
//			case first: orderFormat = (first + " " + mi + " " + last );break;
//			case "firstLast": orderFormat = (first + " " + last );break;
//			case "lastFirstMi":  orderFormat = (last + ", " + first + " " + mi);break;
//			case "lastFirst":  orderFormat = (last + ", " + first);break;
//			default:System.out.println("Missing name part"); 
//		}
//			
        request.setAttribute("colors", colors);
		
		return "babylottoResult";
	}



//	   private void sumArray(){
//		      
//		      int sum = 0;
//		      //Advanced for loop
//		      for( int num : array) {
//		          sum = sum+num;
//		      }

}