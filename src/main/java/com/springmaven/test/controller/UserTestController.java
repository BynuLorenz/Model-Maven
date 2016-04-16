package com.springmaven.test.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmaven.test.controller.path.Path;

@Controller
@RequestMapping(value = Path.WELCOME)
public class UserTestController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap map) {

		System.out.print("hello");
		System.out.print("hello");
		System.out.print("hello");
		System.out.print("hello");
		System.out.print("hello");
		System.out.print("hello");
		map.addAttribute("hello", "SUCCESS");
		return "welcome";
	}
	
	@RequestMapping(value = "/func", method = RequestMethod.POST)
	public String doFunction(){
		System.out.println("doFunction...");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
		return "welcome";
	}

}
