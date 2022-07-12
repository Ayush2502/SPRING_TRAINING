package com.example.demo;


import com.example.demo.Entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;


    @Test
    @Sql("/test.sql")

   public void getEmployeeById()
    {
      ResponseEntity<Employee> response = testRestTemplate.getForEntity("/employee/1001",Employee.class);
        Assertions.assertEquals(1001,response.getBody().getId());
        Assertions.assertEquals(1001,response.getBody().getFirstName());
        Assertions.assertEquals(1001,response.getBody().getLastName());
    }
}
