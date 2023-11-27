package com.student.management.student;


import com.student.management.common.Result;
import com.student.management.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("add")
    public Result<Boolean> addStudent(@RequestBody StudentDO student) {
        studentService.addStudent(student);
        return Result.ok(true);
    }

    @GetMapping("list")
    public Result<List<StudentDO>> listStudent() {
        return Result.ok(studentService.listStudent());
    }

    @PostMapping("changeclass")
    public Result<Boolean> changeClass(@RequestBody StudentEditDTO model) {
        return Result.ok(studentService.changeClass(model));
    }
}
