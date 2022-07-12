package com.example.demo;


import com.example.demo.EmployeeRepo.EMployeeRepo;
import com.example.demo.Entity.Employee;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.assertj.core.api.Assertions;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeerepoTests {

    @Autowired
    private EMployeeRepo employeeRepo;

    @Test
@Rollback(value = false)
   @Order(1)
    public void saveEmployeeTest()
    {
        Employee employee = Employee.builder().firstName("Ayush").lastName("Keshri").build();

        employeeRepo.save(employee);

        Assertions.assertThat(employee.getId()).isGreaterThan(0);
    }

    @Test
    @Rollback(value = false)
    @Order(2)
    public void getEmployee()
    {
        Employee employee = employeeRepo.findById(1L).get();
        Assertions.assertThat(employee.getId()).isEqualTo(1L);
    }

    @Test
    @Rollback(value = false)
    @Order(3)
    public void updateEmployee()
    {
        Employee employee = employeeRepo.findById(1L).get();
        employee .setLastName("Kumar");
        Employee updated = employeeRepo.save(employee);
        Assertions.assertThat(updated.getLastName()).isEqualTo("Kumar");
    }
//    @Test
//    @Rollback(value = false)
//    @Order(4)
//    public void deleteEmployee()
//    {
//        Employee employee = employeeRepo.findById(1L).get();
//        employeeRepo.delete(employee);
//        Employee employee1 =null;
//        Optional<Employee> optionalEmployee = employeeRepo.findByID(1L);
//
//        if(optionalEmployee.isPresent())
//        {
//            employee1=optionalEmployee.get();
//        }
//        Assertions.assertThat(employee1).isNull();
//    }
}
