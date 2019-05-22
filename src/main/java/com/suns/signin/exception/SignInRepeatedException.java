package com.suns.signin.exception;

import com.suns.signin.APICode;

/**
 * Created by sunshuai on 2019/5/22
 */
public class SignInRepeatedException extends BaseException {
    public SignInRepeatedException(){
        super.setCode(APICode.SIGN_IN_REPEATED);
    }
}
