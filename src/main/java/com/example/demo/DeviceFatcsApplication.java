package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class DeviceFatcsApplication extends SpringBootServletInitializer implements WebApplicationInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DeviceFatcsApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(DeviceFatcsApplication.class, args);
	}
	
}
