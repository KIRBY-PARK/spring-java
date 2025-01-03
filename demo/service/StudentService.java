package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentService {
    // 속성
    private final StudentRepository studentRepository;

    // 생성자
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    // 생성
    public String createStudentService(String studentName){
        // 학생 생성
        log.info("학생을 생성합니다.");

        Student student = new Student();
        student.setName(studentName);

        studentRepository.save(student);
        return "성공";
    }

    // 조회


    // 수정


    // 삭제


    // 기능
    public String methodA(int a){
        log.info("::: StudentService.methodA :::");
        log.info("숫자 a : {}", a);
        return "서비스 메소드.";
    }
}
