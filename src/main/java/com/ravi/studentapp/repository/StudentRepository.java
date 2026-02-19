package com.ravi.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ravi.studentapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

