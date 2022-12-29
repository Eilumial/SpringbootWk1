package com.acc.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("App 3");
		// ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// Address2 add = context.getBean("address2", Address2.class);
//		Employee emp = context.getBean("employee", Employee.class);
//		System.out.println(emp.toString());
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		//Employee emp = context.getBean("employee", Employee.class);
		//System.out.println(emp.toString());
		
//		Address address = context.getBean("addressBean",Address.class);
//		
//		System.out.println(address);
//		Address address2 = context.getBean("addressBean",Address.class);
//		System.out.println(address2);
		
		Collage col = context.getBean("collageAlias", Collage.class);
		//Collage col = context.getBean("collageBeanDefinition", Collage.class);
		System.out.println(col);
		col.welcome();
		Collage col2 = context.getBean("collageAlias", Collage.class);
		System.out.println(col2);
		col2.welcome();

	}

}
