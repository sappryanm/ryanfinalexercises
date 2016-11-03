package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("favorties")
public class FavoriteController {
	
	@RequestMapping(path={"/", "/page1"}, method=RequestMethod.GET)
	public String showPage1(){
		return "page1";
	}
	
	@RequestMapping(path={"page1"}, method=RequestMethod.POST)
	public String handlePage1Date(@RequestParam String color, ModelMap map) {
		
		Favorites favorites = new Favorites();
		favorites.setColor(color);
		map.addAttribute("favorites", favorites);
		return "redirect:/page2";
		
	}



}

