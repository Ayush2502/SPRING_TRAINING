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
    public String updateEmp(employee employee, String id) {
        List<employee> e = employeeRepository.findAll();
        int i = -1;
        for (employee t : e) {
            if (t.getId().equals(id)) {
                i++;
            }
        }
        if (i == -1) {
            return "Data Doesn't exist";
        }
        employeeRepository.save(employee);
        return "Data with ID: " +id+" is updated";
    }
    //
    //Delete employee Record
    public String deleteEmployee(String id) {
        List<employee> e = employeeRepository.findAll();
        String ans = "";
        for (employee t : e) {
            if (t.getId().equals(id)) {
                ans = t.getId();
            }
        }
        employeeRepository.deleteById(ans);
        if (ans.length()>0) {
            return "Data Deleted";
        }
        return "Data Doesn't Exists";
    }
    public List<employee> findAllemployeebycity(String city)
    {
        return employeeRepository.findAllByCity(city);
    }
}
