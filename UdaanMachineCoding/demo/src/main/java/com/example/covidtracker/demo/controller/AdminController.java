package com.example.covidtracker.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import com.example.covidtracker.demo.model.Admin;
import com.example.covidtracker.demo.model.CovidTestResult;
import com.example.covidtracker.demo.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AdminController {

    @Autowired
    AdminService adminService;


    @PostMapping(value="/api/registerAdmin", produces="application/json")
    public ResponseEntity<Admin> registerUser(@RequestBody Admin admin){

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        Admin createdAdmin = adminService.registerAdmin(admin);
        return new ResponseEntity<Admin>(createdAdmin, headers, HttpStatus.CREATED);
        
    }
    
    @PutMapping(value="/api/updateCovidResult", produces="application/json")
    public ResponseEntity<Map<String,Boolean>> registerUser(@RequestBody CovidTestResult covidTestResult){

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        Map<String,Boolean> updateInfo = new LinkedHashMap<>();
        boolean isUpdateSuccess= adminService.updateStatus(covidTestResult);
        updateInfo.put("updated", isUpdateSuccess);

        return new ResponseEntity<Map<String,Boolean>>(updateInfo, headers, HttpStatus.OK);
        
    } 
}
