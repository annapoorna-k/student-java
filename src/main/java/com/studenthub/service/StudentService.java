package com.studenthub.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.studenthub.entity.Student;
import com.studenthub.repository.StudentRepository;
@Service
public class StudentService{
private final StudentRepository repo;
public StudentService(StudentRepository repo){this.repo=repo;}
public List<Student> getAll(){return repo.findAll();}
public Student save(Student s){return repo.save(s);}
public Student get(Long id){return repo.findById(id).orElse(null);}
public void delete(Long id){repo.deleteById(id);}
}