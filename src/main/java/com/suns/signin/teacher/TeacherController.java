package com.suns.signin.teacher;

import com.suns.signin.APICode;
import com.suns.signin.Response;
import com.suns.signin.exception.BaseException;
import com.suns.signin.qrcode.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunshuai on 2019/5/22
 */
@RestController
@RequestMapping(path = "/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;


    @ResponseBody
    @PostMapping(path = "/login")
    public Response login(@RequestBody Teacher teacher) throws BaseException {
        String username = teacher.getUsername();
        String password = teacher.getPassword();
        teacherService.login(username, password);
        return new Response<>(APICode.SUCCESS);
    }
}
