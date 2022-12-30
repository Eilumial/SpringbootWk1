package com.acc.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.acc.spring3.BeanConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Car.class);
		Car c = context.getBean("car",Car.class);
		c.getT().sch();
	}

}
