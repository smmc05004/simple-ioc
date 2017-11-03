package com.sample.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		String resources = "classpath:/META-INF/spring/demo6-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resources);

		MessageService service = context.getBean("service", MessageService.class);
		service.sendMessage("안녕", "L");
	}
}
