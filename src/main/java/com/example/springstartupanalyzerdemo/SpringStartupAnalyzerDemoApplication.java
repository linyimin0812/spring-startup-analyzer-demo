package com.example.springstartupanalyzerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStartupAnalyzerDemoApplication {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);
		SpringApplication.run(SpringStartupAnalyzerDemoApplication.class, args);
	}

}
