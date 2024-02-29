package com.bridgelabz.greetings.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetings.model.Greetings;
import com.bridgelabz.greetings.services.GreetingService;
@RestController

public class GreetingsController {
	@Autowired
	private GreetingService greetingservice;
	@PostMapping("/save")
	public Greetings saveGreeting(@RequestBody Greetings greeting) {
        Greetings savedGreeting = greetingservice.saveGreeting(greeting);
        return savedGreeting;
    }
	@GetMapping("/greet/{id}")
	public String getbyId(@PathVariable String id) {
		 Greetings greeting = greetingservice.getById(Long.parseLong(id));

		    if (greeting != null) {
		        return greeting.getMessage();
		    } else {
		        return "Greeting not found";
		    }
		
	}
	@GetMapping("/greet/getAll")
	public List<Greetings> getAllGreetings(){
		return greetingservice.getAllGreetings();
		
		
	}
	@PostMapping("/delete/{id}")
	public String deletebyId(@PathVariable String id){
		greetingservice.deleteGreeting(Long.parseLong(id));
		return "string deleted successfully";
	
	}
		
	}
	

