package com.suns.signin.qrcode;

import com.suns.signin.APICode;
import com.suns.signin.Response;
import com.suns.signin.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunshuai on 2019/5/22
 */
@RestController
@RequestMapping(path = "/qrcode")
public class QrCodeController {

    @Autowired
    private QrCodeService qrCodeService;


    //学生扫码签到
    @ResponseBody
    @PostMapping(path = "/signin")
    public Response signin(@RequestBody Student student, @RequestParam("serial") String serial) throws BaseException {
        String stuID = student.getStuID();
        String stuName = student.getStuName();
        String openid = student.getOpenid();
        qrCodeService.signin(stuID, stuName, openid, serial);
        return new Response<>(APICode.SUCCESS);
    }


    //教师发起新的签到
    @ResponseBody
    @PostMapping(path = "/sign")
    public Response addSign(@RequestBody SignRequestBody signRequestBody) {
        return new Response<>(APICode.SUCCESS, qrCodeService.addSign(signRequestBody));
    }

    //教师查询所有的签到
    @ResponseBody
    @GetMapping(path = "/sign")
    public Response getSign(@RequestParam("teacher") String teacher) throws BaseException {
        return new Response<>(APICode.SUCCESS, qrCodeService.getSign(teacher));
    }

    @ResponseBody
    @DeleteMapping(path = "/sign")
    public Response deleteSign(@RequestParam("serial") String serial) throws BaseException {
        qrCodeService.deleteSign(serial);
        return new Response<>(APICode.SUCCESS);
    }

    @ResponseBody
    @PutMapping(path = "/sign")
    public Response updateSign(@RequestBody QrCode qrCode) throws BaseException {
        qrCodeService.updateSign(qrCode);
        return new Response<>(APICode.SUCCESS);
    }

    @ResponseBody
    @GetMapping(path = "/signstudent")
    public Response getSignStudent(@RequestParam("serial") String serial) throws BaseException {
        return new Response<>(APICode.SUCCESS, qrCodeService.getSignStudent(serial));
    }

    @ResponseBody
    @PutMapping(path = "/signstudent")
    public Response updateSignStudent(@RequestBody SignStudentRequestBody signStudentRequestBody) throws BaseException {
        qrCodeService.updateSignStudent(signStudentRequestBody.getId(),signStudentRequestBody.getSerial(), signStudentRequestBody.getStuId(), signStudentRequestBody.getOpenId(), signStudentRequestBody.getState() );
        return new Response<>(APICode.SUCCESS);
    }


}
