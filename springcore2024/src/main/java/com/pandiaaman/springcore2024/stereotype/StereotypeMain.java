package com.pandiaaman.springcore2024.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springcore2024/stereotype/stereotypeAnnotations.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student);
	}

}
