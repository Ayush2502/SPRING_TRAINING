package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InitialSpringApplication implements InitialSpringApplication1 {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(InitialSpringApplication.class, args);

		}

	@Override
	public void run() throws Exception {

	}
}
