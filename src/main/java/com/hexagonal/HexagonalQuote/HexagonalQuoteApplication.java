package com.hexagonal.HexagonalQuote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableFeignClients
public class HexagonalQuoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalQuoteApplication.class, args);
	}

}
