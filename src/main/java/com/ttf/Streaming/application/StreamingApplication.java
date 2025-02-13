package com.ttf.Streaming.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ttf")
public class StreamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamingApplication.class, args);
	}

}
