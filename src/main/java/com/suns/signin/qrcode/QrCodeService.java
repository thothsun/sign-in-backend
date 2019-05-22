package com.suns.signin.qrcode;

import org.springframework.stereotype.Service;

/**
 * Created by sunshuai on 2019/5/22
 */
@Service
public class QrCodeService {


    public SerialResponse getQrCodeSerial(){

        return new SerialResponse("111");
    }


    public void signin(String stuID, String stuName, String qrcodeSerial) {

        System.out.println(stuID + "," + stuName + "," + qrcodeSerial);

    }
}
