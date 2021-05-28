package com.dhakad;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dhakad")
public class MyConfig {

	@Bean
	public SessionFactory sessionFactory() {
		return Utility.getSf();
	}
	@Bean
	public StudentDaoImpl dao() {
		StudentDaoImpl sd=new StudentDaoImpl();
		//sd.setSf(sessionFactory());
		return sd;
	}
	public StudentEntry se() {
		StudentEntry sen=new StudentEntry();
		// sen.setSd(dao());
		return sen;
	}
	
}
