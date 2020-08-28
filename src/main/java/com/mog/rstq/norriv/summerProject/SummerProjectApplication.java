package com.mog.rstq.norriv.summerProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;


@SpringBootApplication
public class SummerProjectApplication  {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SummerProjectApplication.class, args);
	}
}
