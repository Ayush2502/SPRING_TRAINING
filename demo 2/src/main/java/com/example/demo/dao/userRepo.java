package com.example.demo.dao;

import com.example.demo.entities.UserRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface userRepo extends CrudRepository<UserRecord,Integer> {

}
