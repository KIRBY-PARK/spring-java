package com.example.demo.controller;

import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링의 핵심!
// 의존성주입(DI : DependencyInjection)
// 제어의 역전(Ioc : Inversion of Control, 제 3자가 프로그램의 흐름을 제어하는 것)

@Slf4j
@RestController // 1. 스프링 컨테이너에 빈으로 등록
@RequestMapping("/students") // 2. /student 라고 요청이 들어오면 StudentController 를 호출할 거에요
public class StudentController { // 클래스 파일 (객체의 청사진)
    // 속성
    private final StudentService studentService; // Final : 불변객체


    // 생성자
    public StudentController(StudentService studentService){
        this.studentService = studentService;

    }

    // 생성
    @PostMapping
    public String createStudentAPI(){
        String studentName = "지안";

        String saveData = studentService(studentName);
        return  saveData;
    }

    // methodA() 기능
    @GetMapping("/methodA")
    public String methodA(){
        log.info("::: StudentController.methodA :::");

        int a = 1;
        studentService.methodA(a);
        return "methodA를 호출했다.";
    }
}
