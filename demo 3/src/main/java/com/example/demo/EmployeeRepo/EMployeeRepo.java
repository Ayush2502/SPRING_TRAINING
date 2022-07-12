package com.example.demo.EmployeeRepo;


import com.example.demo.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EMployeeRepo  extends CrudRepository<Employee,Long> {

    //Optional<Employee> findByID(long id);
}
