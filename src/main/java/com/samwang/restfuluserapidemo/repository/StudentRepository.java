package com.samwang.restfuluserapidemo.repository;

import com.samwang.restfuluserapidemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
