package com.example.spring_training.controller;

import com.example.spring_training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring_training.model.employee;
import java.util.*;
import com.example.spring_training.service.employeeservice;
import org.springframework.stereotype.Service;

@RestController
public class EmployeeController {

    @Autowired
    employeeservice employeeservice;

    @GetMapping("/employee")
    public List<employee> getEmployee()
    {
      List<employee> employeelist = employeeservice.getemployee();
      return employeelist;
    }
    @PostMapping("/addemployee")
    public String saveemployee(@RequestBody() employee employee)
    {
        return employeeservice.saveemployee(employee);
    }
}
