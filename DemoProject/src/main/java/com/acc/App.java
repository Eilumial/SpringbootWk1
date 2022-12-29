package com.acc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Airtel obj1=(Airtel)context.getBean("airtel_single");	//typecasting type 1 
        System.out.println("Single: "+obj1);
        
        Airtel obj2=context.getBean("airtel_proto", Airtel.class); //typecasting type 2
        System.out.println("Proto1: "+obj2);
        Airtel obj3=context.getBean("airtel_proto", Airtel.class);
        System.out.println("Proto2: "+obj3);
        
        Airtel obj1b=(Airtel)context.getBean("airtel_single");	//typecasting type 1 
        System.out.println("Single: "+obj1b);
        
        Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
//        System.out.println(voda);
    }
    	
}
