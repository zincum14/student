package com.student.management.student.service;

import com.student.management.student.StudentDO;
import com.student.management.student.StudentEditDTO;

import java.util.List;

public interface StudentService {
    boolean addStudent(StudentDO student);
    List<StudentDO> listStudent();
    boolean changeClass(StudentEditDTO studentEditDto );
}
