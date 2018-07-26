package org.gontuseries.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant{

	public void greetCustomer() {

		System.out.println("Welcome dear customer!! This is the LifeCyce demo");
	}

	@PostConstruct
	public void init()  {

		System.out.println("Restaruant Bean is going through innit");
	}

	@PreDestroy
	public void destroy() throws Exception {

		System.out.println("Bean will destroy now");
	}

}