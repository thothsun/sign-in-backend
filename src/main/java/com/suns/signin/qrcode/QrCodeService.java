package com.suns.signin.qrcode;

import com.suns.signin.exception.BaseException;
import com.suns.signin.exception.SignNotExistException;
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


    public void signin(String stuID, String stuName, String openid, String qrcodeSerial) {
        System.out.println(stuID + "," + stuName + "," + qrcodeSerial);
    }


    public SerialResponse addSign(QrCode qrCode) {
        qrCodeMapper.addSign(qrCode);
        return new SerialResponse(qrCode.getSerial());
    }


    public SignResponse getSign(String teacher) throws BaseException {
        List<QrCode> qrCodes = qrCodeMapper.getSign(teacher);
        if (qrCodes.size() == 0) {
            throw new TeacherHasNoSignException();
        }
        return new SignResponse(qrCodes);
    }

    public void deleteSign(String serial) throws BaseException {
        if (qrCodeMapper.deleteSign(serial) == 0) {
            throw new SignNotExistException();
        }
    }

    public void updateSign(QrCode qrCode) throws BaseException {
        if (qrCodeMapper.updateSign(qrCode) == 0) {
            throw new SignNotExistException();
        }
    }
}
