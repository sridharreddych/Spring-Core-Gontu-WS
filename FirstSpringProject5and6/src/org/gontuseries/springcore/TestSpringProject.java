package org.gontuseries.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Restaruant restaruantObj = (Restaruant) context.getBean("restaurantBean");
		restaruantObj.greetCustomer();
		
		//using setter method we have set the properties value
	}
}
