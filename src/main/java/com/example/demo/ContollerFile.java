package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContollerFile {

	@RequestMapping(value = "/testAPI", method = RequestMethod.GET, produces = "application/json")
	public String testAPI() {
		return "DONE";
		
	}
}
