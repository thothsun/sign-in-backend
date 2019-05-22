package com.suns.signin.teacher;

import com.suns.signin.exception.BaseException;
import com.suns.signin.exception.TeacherNotExistException;
import com.suns.signin.exception.TeacherPasswordErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunshuai on 2019/5/22
 */
@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public void login(String username, String password) throws BaseException {
        Teacher teacher = teacherMapper.getTeachersByUsername(username);
        if (teacher == null){
            throw new TeacherNotExistException();
        }

        if (!password.equals(teacher.getPassword())){
            throw new TeacherPasswordErrorException();
        }
    }
}
