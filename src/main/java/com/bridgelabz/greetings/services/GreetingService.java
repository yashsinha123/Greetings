package com.bridgelabz.greetings.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetings.model.Greetings;
import com.bridgelabz.greetings.repository.GreetingsRepository;

@Service

public class GreetingService {
	@Autowired
	 private GreetingsRepository greetingrepostory;
	
	public Greetings saveGreeting(Greetings greeting) {
		greetingrepostory.save(greeting);
        return greeting;
    }
	 public Greetings getById(long id) {
	        Greetings greeting = greetingrepostory.findById(id).orElse(null);
	        
	        return greeting;
	    }
	 public List<Greetings> getAllGreetings() {
	        return greetingrepostory.findAll();
	    }
	  public void deleteGreeting(Long id) {
		  greetingrepostory.deleteById(id);
	    }
	
}
