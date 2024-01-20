package com.pandiaaman.springcore2024.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {
		
		System.out.println("studying bean life cycle");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springcore2024/lifecycle/lifeCycleConfig.xml");
		
		Samosa samosaObject = context.getBean("samosaObject1", Samosa.class);
		System.out.println(samosaObject);
		
		context.registerShutdownHook();
		
	}

}
