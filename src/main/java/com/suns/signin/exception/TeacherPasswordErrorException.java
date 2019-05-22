package com.suns.signin.exception;

import com.suns.signin.APICode;

/**
 * Created by sunshuai on 2019/5/22
 */
public class TeacherPasswordErrorException extends BaseException {
    public TeacherPasswordErrorException(){
        super.setCode(APICode.TEACHER_PASSWORD_ERROR);
    }
}
