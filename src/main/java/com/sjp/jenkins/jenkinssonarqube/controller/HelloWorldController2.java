package com.sjp.jenkins.jenkinssonarqube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController2 {

	@GetMapping("/hello-world2")
	public String helloWorld() {
		return "Hello World2";
	}
	
}
