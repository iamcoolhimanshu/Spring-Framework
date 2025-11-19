package com.Udemy.spring_framework.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
	public String hello() {
		return "Hello controller";
	}
}
