package com.CyberSoft.studentController.service;

import com.CyberSoft.studentController.Entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAllStudents();
    void insertStudent(StudentEntity studentEntity);
}
