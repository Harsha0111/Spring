package com.nseit.Spring;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

	//	BinarySearchImpl binarySearch = new BinarySearchImpl();

		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		int result = binarySearch.binarySearch(new int[]{3,7,9,12}, 9);

		System.out.println(result);

		SpringApplication.run(Application.class, args);
	}

}
