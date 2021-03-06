package com.empr.begin.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.empr.begin")
@SpringBootApplication
public class DemoApplication  extends SpringBootServletInitializer {

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DemoApplication.class);
	    }
	
	public static void main(String[] args) {
						
     	SpringApplication.run(DemoApplication.class, args);
		
	}
}
