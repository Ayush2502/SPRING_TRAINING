package com.example.RelationalMapping.Dao;

import com.example.RelationalMapping.Entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {
}
