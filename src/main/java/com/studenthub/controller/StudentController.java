package com.studenthub.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.studenthub.entity.Student;
import com.studenthub.service.StudentService;
@RestController
@RequestMapping("/students")
public class StudentController{
private final StudentService service;
public StudentController(StudentService service){this.service=service;}
@GetMapping public List<Student> getAll(){return service.getAll();}
@PostMapping public Student create(@RequestBody Student s){return service.save(s);}
@GetMapping("/{id}") public Student get(@PathVariable Long id){return service.get(id);}
@DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}