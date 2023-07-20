package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav=new ModelAndView();
	    mav.addObject("welcomemsg","welcome to ashokit");
	    mav.setViewName("welcomemessage");
	    return mav;
	}

   @GetMapping("/greet")
   public ModelAndView greetMsg() {
	ModelAndView mav=new ModelAndView();
	mav.addObject("greetmsg", "good evening..!");
	mav.setViewName("greetmessage");
	return mav;
	
   }

}
