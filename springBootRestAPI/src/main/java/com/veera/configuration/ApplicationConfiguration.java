package com.veera.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Veera
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.veera.controller","com.veera.service"})
public class ApplicationConfiguration extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationConfiguration.class);
    }
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}

}
