package com.hitachi.DB_CONNECT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) 
// @SpringBootApplication
// "@GetMapping"
public class DbConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbConnectApplication.class, args);
	}
	// "@GetMapping"
	public String working() {
		return "It's working";
	}
}
