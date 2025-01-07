package com.example.demo.dto;

public class StudentCreateResponseDto {
    private Long id;

    public StudentCreateResponseDto(Long id){
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
