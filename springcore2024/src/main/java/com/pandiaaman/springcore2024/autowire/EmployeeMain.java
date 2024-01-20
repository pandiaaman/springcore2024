package com.pandiaaman.springcore2024.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springcore2024/autowire/autowireConfig.xml");

		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1);
	}

}
