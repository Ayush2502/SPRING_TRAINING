package com.example.spring_training.controller;

import com.example.spring_training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    //To create an employee record
//    @PostMapping("/add")
//    public String saveEmployee(@RequestBody employee employee){
//        return employeeservice.saveemployee(employee);
//    }


    //To update an employee record
    @PutMapping("/employee/{id}")
    public String updateEmp(@RequestBody employee employee, @PathVariable String id){
        return employeeservice.updateEmp(employee,id);
    }

    //To delete an employee record
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable String id){
        return employeeservice.deleteEmployee(id);
    }
    @GetMapping("/employee/{city}")
    public ResponseEntity findemployeebycity(@PathVariable("city") String city)
    {
        return ResponseEntity.ok(employeeservice.findAllemployeebycity(city));
    }

}
