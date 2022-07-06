package com.example.RelationalMapping.Dao;

import com.example.RelationalMapping.Entities.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepo extends CrudRepository<Items,Integer> {
}
