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
		mav.addObject("message", "Welcome To World");
		return mav;
	}
	
	
//	@RequestMapping(value=  "/test" )
//	public ModelAndView test(@RequestParam(value="greeting" ,required=false) String message){
//		if(message==null){
//			 message="Hey What'sUp";
//		}
//		
//		ModelAndView mav=new ModelAndView( "page");
//		mav.addObject("message", message);
//		return mav;
//	}
	
	@RequestMapping(value=  "/test/{message}" )
	public ModelAndView test(@PathVariable("message") String message){
		if(message==null){
			 message="Hey What'sUp";
		}
		
		ModelAndView mav=new ModelAndView( "page");
		mav.addObject("message", message);
		return mav;
	}
}
