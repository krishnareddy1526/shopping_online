package com.krishna.shopping_online;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {
  
	
	@RequestMapping(value= { "/", "/home", "/index"} )
	public ModelAndView index(){
		ModelAndView mav=new ModelAndView("page");
		mav.addObject("title", "Home");
		mav.addObject("userClickedHome", true);
		return mav;
	}
	
	@RequestMapping(value= "about" )
	public ModelAndView about(){
		ModelAndView mav=new ModelAndView("page");
		mav.addObject("title", "AboutUs");
		mav.addObject("userClickedAbout", true);
		return mav;
	}
	@RequestMapping(value= "contact" )
	public ModelAndView contact(){
		ModelAndView mav=new ModelAndView("page");
		mav.addObject("title", "contactus");
		mav.addObject("userClickedcontact", true);
		return mav;
	}
}
