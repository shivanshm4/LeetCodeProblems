package com.example.covidtracker.demo.service;

import com.example.covidtracker.demo.model.AssessmentResult;
import com.example.covidtracker.demo.model.User;
import com.example.covidtracker.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public User registerUser(User user) {
        
        return userRepository.save(user);
        
    }


    public AssessmentResult userAssessment(User user){
        
        AssessmentResult assessmentResult = new AssessmentResult();
        if (user.getSymptoms().length == 0 && !user.isTravelHistory() && !user.isContactWithCovidPatient()) {
            assessmentResult.setRiskPercent(5);
        } else if (user.getSymptoms().length == 1 && (!user.isTravelHistory() || !user.isContactWithCovidPatient())) {
            assessmentResult.setRiskPercent(50);
        } else if(user.getSymptoms().length == 2 && !user.isTravelHistory() && !user.isContactWithCovidPatient()) {
            assessmentResult.setRiskPercent(75);
        } else if(user.getSymptoms().length > 2 && !user.isTravelHistory() && !user.isContactWithCovidPatient()){
            assessmentResult.setRiskPercent(95);
        }
        return assessmentResult;
    }
}
