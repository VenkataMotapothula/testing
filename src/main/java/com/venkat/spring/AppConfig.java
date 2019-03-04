package com.venkat.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.venkat")
public class AppConfig {
	
	@Bean
	public HelloVenkat getHelloVenkat() {
		HelloVenkat helloBean = new HelloVenkat();
		return helloBean;
	}
}
