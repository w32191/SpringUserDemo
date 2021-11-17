package com.samwang.restfuluserapidemo.controller;

import com.samwang.restfuluserapidemo.entity.Student;
import com.samwang.restfuluserapidemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/students/{studentId}")
  public Student findById(@PathVariable Integer studentId) {
    return studentService.findById(studentId);
  }

  @PostMapping("/students")
  public String create(@RequestBody Student student) {
    return studentService.creatStudent(student);
  }

  @PutMapping("/students/{studentId}")
  public String update(@PathVariable Integer studentId, @RequestBody Student student) {
    return studentService.editStudent(studentId, student);
  }

  @DeleteMapping("/students/{studentId}")
  public String delete(@PathVariable Integer studentId) {
    return studentService.deleteById(studentId);
  }


}
