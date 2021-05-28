package com.dhakad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentEntry {

	@Autowired
	private static StudentDaoImpl sd;
	
	public static StudentDaoImpl getSd() {
		return sd;
	}

	public static void setSd(StudentDaoImpl sd) {
		StudentEntry.sd = sd;
	}

	public static void main(String[] args) {
	
		Student s1=new Student(5, "Nagar", "b2");
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		sd=context.getBean("dao", StudentDaoImpl.class);
	
		sd.save(s1);
		
	}

}
