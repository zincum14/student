package com.student.management.student.service;

import com.student.management.student.pojo.StudentDO;
import com.student.management.student.pojo.StudentEditDTO;

import java.util.List;

public interface StudentService {
    boolean addStudent(StudentDO student);
    List<StudentDO> listStudent();
    boolean changeClass(StudentEditDTO studentEditDto );
}
