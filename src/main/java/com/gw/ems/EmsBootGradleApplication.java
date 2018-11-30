package com.gw.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(scanBasePackages="com.gw.ems")
public class EmsBootGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsBootGradleApplication.class, args);
	}
}
