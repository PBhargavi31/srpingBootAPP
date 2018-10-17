package com.verizon.controller;

//doining this to say this is a controllere
//controller is a collection of actions
//an action is cap of receiving request and doing some task as response
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class defaultController {
	//this will recieve request and return the name of a view called home.
	//problme is how many varierty of requests we get from web-lot many
	//so inform to what kind of request,it will respond, so using annotation
	@RequestMapping(value={"","/","/home"},method = RequestMethod.GET)		//says to what it will respond 
	//it returns a view name,view named as Home
	public String defaultAction(){
		//action is expected to return a string or a modelview
		return "home";
	}
	
	
		//here view name should be converted to actual View(home.jsp), this is just home-name of view
	
	//creating aboutus action, specifying the url,and if get request then about us is exceuted.
	//aboutus wants to share data(in our words model),
	//action should return model and vioew together
	//view name sjhould be about page,
	//adding 3 main things by using addobject, everyobject has a key and a value.
	@RequestMapping(value="/aboutUs",method = RequestMethod.GET)
	public ModelAndView aboutUsAction(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("aboutPage");
		mv.addObject("webmaster","vamsy kiran a");
		mv.addObject("devTeam",new String[]{"Anil","naoushin","Lini"});
		mv.addObject("adminmailid","vamsy.kiran@iiht.com");
		
		return mv;
		//acxtual view name will be /pages/aboutpage.jsp
		//as in internally we have prefix and suffix
	}

}

