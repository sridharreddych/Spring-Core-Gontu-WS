package org.gontuseries.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Restaurant restaruantObj1 = (Restaurant) context.getBean("restaurantBean");
		restaruantObj1.setWelcomeNote("Object1 is setting welcome note properrty");
		restaruantObj1.greetCustomer();

		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.greetCustomer();

	}
}