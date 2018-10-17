package com.verizon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	
	@Autowired
	public String defaultWelcomeAction()
	{
		return "welcomeFormPAge";
	}
	
	@GetMapping
	public String defaultWelcomeAction(){
		return "WelcomeFormPqage";
		// the url will be /pages/welcomeFromPage.jsp
	}
	
	
	
	@PostMapping
	public ModelAndView submitWelcomeFormAction(@RequestParam("unm")String userName){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WelcomeUsaerpage");
		mv.addObject("WelcomeStatement", "hello" +userName+ "Welcome Aboard!");
		mv.addObject("WelcomeStatement", welService.getWelcomeStatement(userName));
		return mv;
	}

}
