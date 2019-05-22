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

    @GetMapping(path = "/serial")
    @ResponseBody
    public Response getQrCodeSerial() {
        return new Response<>(APICode.SUCCESS, qrCodeService.getQrCodeSerial());
    }

    @ResponseBody
    @PostMapping(path = "/signin")
    public Response login(@RequestBody Student student, @RequestParam("serial") String serial) throws BaseException {
        String stuID = student.getStuID();
        String stuName = student.getStuName();
        qrCodeService.signin(stuID, stuName, serial);
        return new Response<>(APICode.SUCCESS);
    }
}
