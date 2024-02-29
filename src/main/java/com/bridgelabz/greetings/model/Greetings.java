package com.bridgelabz.greetings.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class Greetings {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	private Long id;
	
	private String message;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Greetings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Greetings(Long id, String userinput) {
		super();
		this.id = id;
		this.message = userinput;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	} 
	
}
