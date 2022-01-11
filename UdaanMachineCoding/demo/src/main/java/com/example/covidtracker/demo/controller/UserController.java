package com.example.covidtracker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.covidtracker.demo.model.AssessmentResult;
import com.example.covidtracker.demo.model.User;
import com.example.covidtracker.demo.service.UserService;

@RestController
@RequestMapping
public class UserController {
    
    @Autowired
    UserService userService;


    @PostMapping(value="/api/registerUser", produces="application/json")
    public ResponseEntity<User> registerUser(@RequestBody User user){

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        User createdUser = userService.registerUser(user);
        return new ResponseEntity<User>(createdUser, headers, HttpStatus.CREATED);
        
    } 

    @GetMapping(value="/api/selfAssessment", produces="application/json")
    public ResponseEntity<AssessmentResult> userAssessment(@RequestBody User user) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        AssessmentResult assessmentResult = userService.userAssessment(user);
        return new ResponseEntity<AssessmentResult>(assessmentResult, headers, HttpStatus.CREATED);
    }
}
