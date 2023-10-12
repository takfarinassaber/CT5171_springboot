package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping(value = "/")
	public String index() {
		return "Hello there !";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Controller
	public static class MyController {

		@RequestMapping("/")
		public String hello1 () {
			return "Hello";
		}
		@RequestMapping("/hello")
		public String hello2 () {
			return "Hello Again";
		}
	}
}
