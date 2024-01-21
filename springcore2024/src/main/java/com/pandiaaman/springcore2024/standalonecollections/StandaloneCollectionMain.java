package com.pandiaaman.springcore2024.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneCollectionMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springcore2024/standalonecollections/standaloneCollection.xml");
		
		Person person1 = context.getBean("person1", Person.class);
		Person person2 = context.getBean("person2", Person.class);

		System.out.println(person1);
		
		System.out.println(person2);
		
		System.out.println(person1.getPersonFriends().getClass().getName());
	}

}
