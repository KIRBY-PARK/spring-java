package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
    // 속성
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne(fetch = FetchType.LAZY) // 연관관계 설정
    @JoinColumn(name = "course_id")
    private Course course;
    private String name;
    private int age;

    // 생성자
    public Student(){

    }

    // 기능
    public void setName(String studentName){
        this.name = studentName;
    }

    public Long getId(){
        return this.id;
    }
}
