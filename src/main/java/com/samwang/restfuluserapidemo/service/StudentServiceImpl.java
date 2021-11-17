package com.samwang.restfuluserapidemo.service;

import com.samwang.restfuluserapidemo.entity.Student;
import com.samwang.restfuluserapidemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student findById(Integer studentId) {
    Student student = studentRepository.findById(studentId).orElse(null);

    return student;
  }

  @Override
  public String creatStudent(Student student) {
    studentRepository.save(student);

    return "學生：" + student.getName() + " 已成功新增 ,ID: " + student.getId();
  }

  @Override
  public String editStudent(Integer studentId, Student student) {
    Student stu = studentRepository.findById(studentId).orElse(null);

    if (stu != null) {
      stu.setName(student.getName());
      stu.setBirthday(student.getBirthday());
      stu.setEmailAddress(student.getEmailAddress());
      studentRepository.save(stu);
      return "學生：" + stu.getName() + " 已完成更新";
    } else {
      return "查無此學生ID";
    }
  }

  @Override
  public String deleteById(Integer studentId) {
    Student student = studentRepository.findById(studentId).orElse(null);
    studentRepository.deleteById(studentId);

    return "學生：" + student.getName() + " 已完成刪除";
  }
}
