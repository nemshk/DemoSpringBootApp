package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(UserRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new User("Abel", "abel@gmail.com", "9876543210", "Brighton")));
	      log.info("Preloading " + repository.save(new User("James", "James@gmail.com", "8965432170", "Hamilton")));
	    };
	  }

}
