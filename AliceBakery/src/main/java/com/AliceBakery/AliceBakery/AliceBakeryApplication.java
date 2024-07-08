package com.AliceBakery.AliceBakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AliceBakeryApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(AliceBakeryApplication.class, args);
		CakeBaker cakeBaker = context.getBean(CakeBaker.class);
		cakeBaker.bakeCake();
	}

}
