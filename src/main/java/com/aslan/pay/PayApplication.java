package com.aslan.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayApplication.class, args);
		System.out.println("Test");
	}

}
