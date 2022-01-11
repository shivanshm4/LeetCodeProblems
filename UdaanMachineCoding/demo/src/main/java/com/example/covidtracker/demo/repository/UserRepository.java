package com.example.covidtracker.demo.repository;

import com.example.covidtracker.demo.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
}
