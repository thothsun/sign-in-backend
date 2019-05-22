package com.suns.signin.exception;

import com.suns.signin.APICode;

/**
 * Created by sunshuai on 2019/5/22
 */
public class TeacherNotExistException extends BaseException {
    public TeacherNotExistException() {
        super.setCode(APICode.TEACHER_NOT_EXIST);
    }
}
