package com.example.covidtracker.demo.service;

import com.example.covidtracker.demo.model.Admin;
import com.example.covidtracker.demo.model.CovidTestResult;
import com.example.covidtracker.demo.model.User;
import com.example.covidtracker.demo.repository.AdminRepository;
import com.example.covidtracker.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class AdminService {

    @Autowired
    AdminRepository adminRepository;
    UserRepository userRepository;

    public Admin registerAdmin(Admin admin) {
        
        return adminRepository.save(admin);
        
    }

    public boolean updateStatus(CovidTestResult covidTestResult) {

        try{
            User user = userRepository.findOne(Long.parseLong(covidTestResult.getUserId()));
            user.setCovidPositive(true);
            userRepository.save(user);
            return true;
        } catch( Exception e ) {
            return false;
        }
        
    }

}
