package com.example.demo.Controller;


import com.example.demo.EmployeeRepo.EMployeeRepo;
import com.example.demo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {


    @Autowired
    private EMployeeRepo employeeRepo;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee employee)
    {
        employeeRepo.save(employee);
        return "The employee is saved successfully";
    }
    @PostMapping("/multipleEmployee")
    public String saveMultipleEmployee(@RequestBody List<Employee> list)
    {
        employeeRepo.saveAll(list);
        return "ALl Employees Saved Successfully";
    }

    @GetMapping("/getEmployeeById/{Id}")
    public Optional<Employee> getEmployee(@PathVariable ("id") long id)
    {
        return employeeRepo.findById(id);
    }

}
