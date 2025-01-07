package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentCreateRequestDto;
import com.example.demo.dto.StudentCreateResponseDto;
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
    public studentCreateResponseDto createStudentService(StudentCreateRequestDto studentCreateRequestDto){
        // 학생 생성
        log.info("학생을 생성합니다.");

        // 데이터 받아오기
        String studentName = studentCreateRequestDto.getName();

        // 엔티티 생성
        Student student = new Student();

        // 엔티티 속성 절정
        student.setName(studentName);

        Student savedStudent = studentRepository.save(student);
        Long savedStudentId = savedStudent.getId();

        // ResponseDto 생성 후 반환
        StudentCreateResponseDto studentCreateResponseDto = new StudentCreateResponseDto();
        return studentCreateResponseDto;
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
