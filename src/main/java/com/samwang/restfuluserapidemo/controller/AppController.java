package com.samwang.restfuluserapidemo.controller;

import com.samwang.restfuluserapidemo.entity.Student;
import com.samwang.restfuluserapidemo.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/form")
  public String form(Model model) {
    Student student = new Student();
    model.addAttribute("student", student);
    return "form";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute Student student, Model model) {
    model.addAttribute("student", student);
    return "add";
  }

}
