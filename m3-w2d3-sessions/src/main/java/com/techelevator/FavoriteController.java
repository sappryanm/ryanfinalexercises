package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("favorites")
public class FavoriteController {
	
	@RequestMapping(path={"/", "/page1"}, method=RequestMethod.GET)
	public String showPage1(){
		return "page1";
	}
	
	@RequestMapping(path={"/page1"}, method=RequestMethod.POST)
	public String handlePage1Date(@RequestParam String color, ModelMap map) {
		
		Favorites favorites = new Favorites();
		favorites.setColor(color);
		map.addAttribute("favorites", favorites);
		return "redirect:/page2";
		
	}
	@RequestMapping(path={"/page2"}, method=RequestMethod.GET)
	public String showPage2(){
		return "page2";
	}
	
	@RequestMapping(path={"/page2"}, method=RequestMethod.POST)
	public String handlePage2Data(@RequestParam String food, ModelMap map) {
		Favorites favorites = (Favorites)map.get("favorites");
		favorites.setFood(food);
		//map.addAttribute("favorites", favorites);
		return "redirect:/page3";
	}
	@RequestMapping(path={"/page3"}, method=RequestMethod.GET)
	public String showPage3(){
		return "page3";
	}
	@RequestMapping(path={"/page3"}, method=RequestMethod.POST)
	public String handlePage3Data(@RequestParam String season, ModelMap map) {
		Favorites favorites = (Favorites)map.get("favorites");
		favorites.setSeason(season);
		//map.addAttribute("favorites", favorites);
		return "redirect:/Summary";
	}
	
	@RequestMapping(path={"/Summary"}, method=RequestMethod.GET) 
		public String handlDisplayFavoriteSummary() {
		return "Summary";
	}


}

