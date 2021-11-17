package com.samwang.restfuluserapidemo.service;


import com.samwang.restfuluserapidemo.entity.Student;
import java.util.List;

public interface StudentService {

  //CRUD
  Student findById(Integer studentId);

  Student creatStudent(Student student);

  String editStudent(Integer studentId, Student student);

  String deleteById(Integer studentId);

  List<Student> findAll();


}
