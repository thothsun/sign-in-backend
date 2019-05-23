package com.suns.signin.teacher;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by sunshuai on 2019/5/22
 */

@Mapper
public interface TeacherMapper {

    @Select("select user_name,password from tb_teacher where user_name = #{username}")
    Teacher getTeachersByUsername(@Param("username") String username);
}
