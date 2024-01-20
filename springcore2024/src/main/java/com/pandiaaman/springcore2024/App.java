package com.pandiaaman.springcore2024;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pandiaaman.springcore2024.studentprac.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springcore2024/studentprac/studentConfig.xml");
        
        Student studentAnisha = context.getBean("studentAnisha", Student.class);
        Student studentAman = context.getBean("studentAman", Student.class);
        Student studentAyaz = context.getBean("studentAyaz", Student.class);
        
        System.out.println(studentAnisha);
        System.out.println(studentAman);
        System.out.println(studentAyaz);
        
    }
}
