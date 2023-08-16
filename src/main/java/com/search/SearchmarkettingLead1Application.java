package com.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class SearchmarkettingLead1Application {

	public static void main(String[] args) {
		SpringApplication.run(SearchmarkettingLead1Application.class, args);
	}

}
