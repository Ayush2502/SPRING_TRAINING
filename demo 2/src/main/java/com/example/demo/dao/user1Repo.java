package com.example.demo.dao;

import com.example.demo.entities.user1Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user1Repo extends JpaRepository<user1Record,Integer>{
}
