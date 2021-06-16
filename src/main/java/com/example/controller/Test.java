package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
@RequestMapping("/hello")
public class Test {

@RequestMapping(value ={" ","/home"})
public String sayHello()
{
	return "Hello" + "From " + "BridgeLaz";
}

@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
public String sayHello(@RequestParam (value ="name")String name)
{
	return "Hello" + " " +name + "From " + "BridgeLaz";
	}

@GetMapping("/param/(name)")
public String satHelloParam(@PathVariable String name)
{
	return "Hello"+name  +"!";
}
@PostMapping("/post")
public String sayHello(@RequestBody User user)
{
	return "Hello" +" "+ user.getFirstName() + " " + user.getLastName() +
			" " + "From  Bridgelabz"; 
}
@PutMapping("/put/{firstname}")
public String sayHelloPut(@PathVariable String firstname, @RequestParam(value ="lastname" )String lastname)
{
	return "Hello" +" "+ firstname + " " + lastname +
			" " + "From  Bridgelabz"; 
}

}
