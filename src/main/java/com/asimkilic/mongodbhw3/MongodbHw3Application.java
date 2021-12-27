package com.asimkilic.mongodbhw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MongodbHw3Application {

	public static void main(String[] args) {
		SpringApplication.run(MongodbHw3Application.class, args);
	}

}
