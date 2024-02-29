package com.bridgelabz.greetings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.greetings.model.Greetings;

public interface GreetingsRepository extends JpaRepository<Greetings, Long>{
	

}
