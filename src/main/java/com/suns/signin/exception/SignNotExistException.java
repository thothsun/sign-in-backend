package com.suns.signin.exception;

import com.suns.signin.APICode;

/**
 * Created by sunshuai on 2019/5/24
 */
public class SignNotExistException extends BaseException {
    public SignNotExistException(){
        super.setCode(APICode.SIGN_NOT_EXIST);
    }
}
