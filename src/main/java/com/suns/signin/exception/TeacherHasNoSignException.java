package com.suns.signin.exception;

import com.suns.signin.APICode;

/**
 * Created by sunshuai on 2019/5/23
 */
public class TeacherHasNoSignException extends BaseException {
    public TeacherHasNoSignException(){
        super.setCode(APICode.TEACHER_HAS_NO_SIGN);
    }
}
