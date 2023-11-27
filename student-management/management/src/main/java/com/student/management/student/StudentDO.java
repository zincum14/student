package com.student.management.student;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class StudentDO {
    @TableId(value = "id", type = com.baomidou.mybatisplus.annotation.IdType.AUTO)
    public long id;
    public String name;
    public int age;
    public GenderEnum gender;
    public int grade;
    public int classId;
}
