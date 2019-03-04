package com.venkat.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationConfig {
	
	public static void main(String arg[]) {
		  
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloVenkat bean = ctx.getBean(HelloVenkat.class);
		bean.hiVenkat();
	}

}
