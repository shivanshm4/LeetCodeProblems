package com.example.covidtracker.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="pincode")
    private String pincode;

    @Column(name="phone_number")
    private String phoneNumber;
}
