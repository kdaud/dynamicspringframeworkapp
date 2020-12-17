package com.concept.patientoutward;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterClass {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ClassFile.xml");
		
		Patient patient = (Patient) applicationContext.getBean("patientcallingapi");
		patient.mycallingfunction();
	}
	
}
