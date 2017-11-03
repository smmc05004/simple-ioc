package com.sample.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resources = "classpath:/META-INF/spring/demo3-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resources);
		
		Pen pen = context.getBean("pen", Pen.class);
		pen.draw();
	}
}
