package com.techelevator;


import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;




@Controller
public class HelloController {
	@Autowired
	private  ReviewDao reviewDao;

	@RequestMapping("/")
	public String showreview(HttpSession session, HttpServletRequest request) {
		request.setAttribute("reviews", reviewDao.getAllReviews());	
		return "greeting";
		
	
	}
	@RequestMapping("/newreview")
	public String displayreview(HttpServletRequest request) {
		return "newreview";
	
	}
	@RequestMapping(path="/addnewreview", method=RequestMethod.POST)
	public String addNewCityByPost(HttpServletRequest request) {
		System.out.println("tttttttttttttttttttttttttttttt");
		String username = request.getParameter("username");
		String rating = request.getParameter("rating");
		String reviewtitle = request.getParameter("reviewtitle");
		String reviewtext = request.getParameter("reviewtext");
		
		Review review = new Review();
		review.setUsername(username);
		review.setRating(Integer.parseInt(rating));
		review.setTitle(reviewtitle);
		review.setText((reviewtext));
		LocalDateTime dateSubmitted = LocalDateTime.now();
		review.setDateSubmitted(dateSubmitted);
		
		
		reviewDao.save(review);
		return "redirect:/";
	}
}
