package com.samwang.restfuluserapidemo.service;

import com.samwang.restfuluserapidemo.entity.Student;
import com.samwang.restfuluserapidemo.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student findById(Integer studentId) {
    return studentRepository.findById(studentId).orElse(null);
  }

  @Override
  public Student creatStudent(Student student) {
    studentRepository.saveAndFlush(student);

    return student;
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

  @Override
  public List<Student> findAll() {
    List<Student> list = studentRepository.findAll();
  return list;
  }
}
