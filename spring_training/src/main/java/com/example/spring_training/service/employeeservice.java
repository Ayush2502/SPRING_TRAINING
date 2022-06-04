package com.example.spring_training.service;

import com.example.spring_training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.spring_training.model.employee;
@Service
public class employeeservice {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<employee> getemployee()
    {
        return employeeRepository.findAll();
    }
    public String saveemployee(employee employee)
    {
        if(employeeRepository.existsById(employee.getId()))
            return "could not add emplyee. it Already exists";
        else
            employeeRepository.save(employee);
        return " employee data saved successfully";
    }
}
