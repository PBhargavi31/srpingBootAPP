package com.verizon.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	
	@Override
	public String getWelcomeStatement(String userName){
		int hour = LocalDateTime.now().getHour();
		
		String greet = "";
		if(hour>=3 && hour<=11)
			greet="good moprning";
		else
			greet="good noon";
		
		return greet + userName + "welcome aboard";
	}
}
