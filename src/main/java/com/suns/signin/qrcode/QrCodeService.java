package com.suns.signin.qrcode;

import com.suns.signin.exception.BaseException;
import com.suns.signin.exception.TeacherHasNoSignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunshuai on 2019/5/22
 */
@Service
public class QrCodeService {

    @Autowired
    QrCodeMapper qrCodeMapper;

    public SerialResponse getQrCodeSerial(String description) {
        QrCode qrCode = new QrCode(description);
        qrCodeMapper.addQrCode(qrCode);
        return new SerialResponse(qrCode.getSerial());
    }


    public void signin(String stuID, String stuName, String openid, String qrcodeSerial) {
        System.out.println(stuID + "," + stuName + "," + qrcodeSerial);
    }


    public SignResponse getAllSign(String teacher) throws BaseException {
        List<QrCode> qrCodes = qrCodeMapper.getAllSign(teacher);
        if (qrCodes.size() == 0) {
            throw new TeacherHasNoSignException();
        }
        return new SignResponse(qrCodes);
    }
}
