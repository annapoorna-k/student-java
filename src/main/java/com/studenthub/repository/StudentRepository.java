package com.studenthub.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.studenthub.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Long>{}