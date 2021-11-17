package com.samwang.restfuluserapidemo.service;


import com.samwang.restfuluserapidemo.entity.Student;

public interface StudentService {

  //CRUD
  Student findById(Integer studentId);

  String creatStudent(Student student);

  String editStudent(Integer studentId, Student student);

  String deleteById(Integer studentId);


}
