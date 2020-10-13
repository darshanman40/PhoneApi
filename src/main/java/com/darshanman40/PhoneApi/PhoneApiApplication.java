package com.darshanman40.PhoneApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class PhoneApiApplication {
	
	@Autowired
    private YAMLConfig myConfig;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(PhoneApiApplication.class);
        app.run();
	}
	
	public void run(String... args) {
		
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}
