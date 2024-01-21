package com.pandiaaman.springcore2024.javaConfigurationUsingBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.pandiaaman.springcore2024.javaConfigurationUsingBeanAnnotation")
public class JavaConfig {

	@Bean("t1")
	public Teacher getT1() {
		return new Teacher(1,"Ashok");
	}
	
	@Bean("t2")
	public Teacher getT2() {
		return new Teacher(1,"Jha");
	}
	
}
