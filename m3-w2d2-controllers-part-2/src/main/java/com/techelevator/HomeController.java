package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;
import com.techelevator.model.JdbcReviewDao;


@Controller
public class HomeController {

	//@Autowired
	//Review reviewDAO;
	JdbcTemplate jdbcTemplate;
	@Autowired
	ReviewDao reviewDAO;
	
	@RequestMapping({"/", "/homepage"})
	public String displayHomePage() {
		return "/homepage";
	}
	@RequestMapping("/reviewForumResult")
	public String handlereviewResult(HttpServletRequest request){

		List<Review> post =  reviewDAO.getAllReviews();
		request.setAttribute("post", post);
		
		return "reviewForumResult";
		
	}
	@RequestMapping(path="/bookForumInput", method=RequestMethod.GET)
	public String handlebookForumInput(){
		
		return "bookForumInput";
	}
	@RequestMapping(path="/bookForumInput", method=RequestMethod.POST)
	public String handlebookForumInputSubmission(@RequestParam String username,
												@RequestParam String title,
												@RequestParam int rating,
												@RequestParam String text){

			Review post = new Review();
			post.setTitle(title);
			post.setUsername(username);
			post.setRating(rating);
			post.setText(text);
			post.setDateSubmitted(LocalDateTime.now());
			reviewDAO.save(post);
		return "redirect:/reviewForumResult";
	}
}