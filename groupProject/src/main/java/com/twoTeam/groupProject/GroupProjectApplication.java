package com.twoTeam.groupProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class GroupProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(GroupProjectApplication.class, args);
		System.out.println("stop");
	}

}
