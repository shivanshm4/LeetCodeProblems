package com.example.covidtracker.demo.repository;

import com.example.covidtracker.demo.model.Admin;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long>{
    
}
