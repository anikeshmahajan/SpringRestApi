package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Test {

@RequestMapping(value ={" ","/home"})
public String sayHello()
{
	return "Hello" + "From " + "BridgeLaz";
}
	
}
