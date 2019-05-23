package com.suns.signin.exception;

import com.suns.signin.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by suns on 2019/3/24 2:39 PM
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response handle(BaseException error){
        return new Response(error.getCode(),error.getMessage());
    }
}
