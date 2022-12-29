package com.acc.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		System.out.println("App 2");
		
//		Airtel obj2=context.getBean("airtel_proto", Airtel.class); //typecasting type 2
//        System.out.println("Proto1: "+obj2);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu=(Student)context.getBean("stu_setter"); 
        stu.displayStudentInfo();
        Student stu2=(Student)context.getBean("stu_construct");
        stu2.displayStudentInfo();
        Student stu3=(Student)context.getBean("stu_mix");
        stu3.displayStudentInfo();
        
	}

}
