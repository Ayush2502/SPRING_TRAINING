package com.example.FeignClient;


import client.UserCLient;
import dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients(basePackageClasses = UserCLient.class)
public class FeignClientApplication {


	@Autowired
	private UserCLient userCLient;

	@GetMapping("/findAllUsers")
	public List<UserResponse> getAllUsers()
	{
		return userCLient.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}

}
