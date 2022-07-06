package com.example.demo.Entities;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Embedded
    private Address address;
    @Embedded
    private Certificate certificate;




}
