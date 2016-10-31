package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WordExercisesController {

@RequestMapping("/lastTwoInput")
public String handleLastTwoInput(HttpServletRequest request){
            
    return "lastTwoInput";
}

@RequestMapping("/lastTwoResult")
public String handleLastTwoResult(HttpServletRequest request){
    
    List<String> original = new ArrayList<String>();
    List<String> flipped = new ArrayList<String>();
    
    for(int i = 1; i <= 10; i++){
        
        String word = request.getParameter("word" + i);
        if(word != null){
            
            String modified = null;
            if(word.length() >= 2){
                modified = word.substring(0, word.length()-2) + word.charAt(word.length()-1)
                                + word.charAt(word.length()-2);
            }
            else if(word.length() ==1){ 
                
                modified = word;        
            }
            if(modified != null){
                
                original.add(word);
                flipped.add(modified);
            }
        }
    }
    
    request.setAttribute("original", original);
    request.setAttribute("flipped", flipped);
    
    return "lastTwoResult";
}
}

