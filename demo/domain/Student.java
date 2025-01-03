package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    // 속성
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private int age;

    // 생성자
    public Student(){

    }

    // 기능
    public void setName(String studentName){
        this.name = studentName;
    }
}
