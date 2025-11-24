package com.bitcodex.bitcodex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class BitcodexApplication {
	public static void main(String[] args) {
		SpringApplication.run(BitcodexApplication.class, args);
	}

	@GetMapping("/")
	public String testFunction() {
		return "Spring boot test run success!";
	}

}
