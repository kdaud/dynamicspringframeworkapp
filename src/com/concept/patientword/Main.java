package com.concept.patientword;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("ConfigurationFile.xml");
		Doctor doctor = (Doctor) beanFactory.getBean("myreferenceapi");
		//doctor.setWelcomeNote("My Programming Journey");
		doctor.printDoctorMetadata();
		
	}
	
}
