package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA를 활용
public interface StudentRepository extends JpaRepository<Student, Long> {

}
