package com.codingDojo.daikichiRoutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/daikichi", method=RequestMethod.GET)
public class HomeController {
	
	@RequestMapping()
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/travel/{location}")
	public String travel(@PathVariable("location") String location) {
		return "Congratulations! You will soon travel to " + location + "!";
	}
	
	@RequestMapping("/lotto/{num}")
	public String todayFortune(@PathVariable("num") int num) {
		if (num%2 != 0) {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
		else {
			return "<h3>You will take a grand journey to the near future, but be weary of tempting offers</h3>";
			
		}
		
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrowFortiune() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	

}
