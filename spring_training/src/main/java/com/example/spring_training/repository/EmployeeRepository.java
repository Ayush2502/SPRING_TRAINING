package com.example.spring_training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.spring_training.model.employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<employee,String> {
    @Query(value = "Select * from employee where city= :city",nativeQuery = true)
    List<employee> findAllByCity(String city);



}
