package com.example.spring_training;

import com.example.spring_training.model.employee;
import com.example.spring_training.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTrainingApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringTrainingApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);

//		employee emp = new employee();
//		emp.setId("12");
//		emp.setAge(32);
//		emp.setName("Mukesh");
//
//		employee emp1 = employeeRepository.save(emp);
//		System.out.println("MY first run");
//		System.out.println(emp1);

	}

}
