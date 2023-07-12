package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {
	// 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

	@GetMapping("/welcome")
	public String welcome() {
		return "Hello welcome to Spring boot application";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
