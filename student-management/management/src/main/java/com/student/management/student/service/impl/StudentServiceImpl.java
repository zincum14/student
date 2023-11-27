package com.student.management.student.service.impl;

import com.student.management.mapper.StudentMapper;
import com.student.management.student.StudentDO;
import com.student.management.student.StudentEditDTO;
import com.student.management.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public boolean addStudent(StudentDO student) {
        studentMapper.insert(student);
        return true;
    }

    public List<StudentDO> listStudent(){
        return studentMapper.selectList(null);
    }

    public boolean changeClass(StudentEditDTO model){
        studentMapper.updateClassId(model.getId(), model.getClassId());
        return true;
    }
}
