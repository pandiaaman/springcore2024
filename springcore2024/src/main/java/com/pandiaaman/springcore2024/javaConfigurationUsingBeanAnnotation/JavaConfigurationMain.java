package com.pandiaaman.springcore2024.javaConfigurationUsingBeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Teacher t1 = context.getBean("t1", Teacher.class);
		System.out.println(t1);
		
		Teacher t2 = context.getBean("t2", Teacher.class);
		System.out.println(t2);
	}

}
