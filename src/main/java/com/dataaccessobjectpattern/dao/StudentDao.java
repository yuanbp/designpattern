package com.dataaccessobjectpattern.dao;

import java.util.List;

import com.dataaccessobjectpattern.entity.Student;

public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}