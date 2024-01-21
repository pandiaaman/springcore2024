package com.pandiaaman.springcore2024.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExpLangauageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springcore2024/springexpressionlanguage/spELconfig.xml");
		
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
	}

}
