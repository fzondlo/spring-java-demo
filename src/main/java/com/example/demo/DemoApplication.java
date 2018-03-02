package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
		constructorService.getMessage();

		SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");
		setterBasedService.getMessage();

		HelloWorldImpl helloWorld = (HelloWorldImpl) ctx.getBean("helloWorldImpl");
		HelloWorldImpl helloWorld2 = (HelloWorldImpl) ctx.getBean("helloWorldImpl");
		HelloWorldImpl helloWorld3 = new HelloWorldImpl();
		helloWorld.sayHello();
		helloWorld.sayHello();
		helloWorld2.sayHello();
		helloWorld3.sayHello();
		System.out.println(helloWorld);
		System.out.println(helloWorld2);
		System.out.println(helloWorld3);
	}
}
