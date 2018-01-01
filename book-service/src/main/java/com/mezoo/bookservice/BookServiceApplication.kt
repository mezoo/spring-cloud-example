package com.mezoo.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
class BookServiceApplication

	fun main(args: Array<String>) {
		SpringApplication.run(BookServiceApplication::class.java, *args)
	}
