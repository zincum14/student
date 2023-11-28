package com.student.management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.student.management.student.pojo.StudentDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper extends BaseMapper<StudentDO> {
    boolean updateClassId(int id, int classId);
}
