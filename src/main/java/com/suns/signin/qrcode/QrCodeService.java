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


    public SerialResponse addSign(SignRequestBody signRequestBody) {
        qrCodeMapper.addSign(signRequestBody.getQrCode());
        Integer serial = signRequestBody.getQrCode().getSerial();
        List<Student> students = signRequestBody.getStudents();

        for (Student student : students) {
            SignStudent signStudent = new SignStudent();
            signStudent.setState("未签到");
            signStudent.setQrcodeSerial(serial);
            signStudent.setStuId(student.getStuID());
            signStudent.setStuName(student.getStuName());
            signStudent.setStuOpenId(student.getOpenid());
            qrCodeMapper.addSignStudent(signStudent);
        }
        return new SerialResponse(signRequestBody.getQrCode().getSerial());
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


    public SignStudentResponse getSignStudent(String serial) throws BaseException {
        List<SignStudent> signStudents = qrCodeMapper.getSignStudent(serial);
        System.out.println(signStudents);
        return new SignStudentResponse(signStudents);
    }

    public void updateSignStudent(String id,String serial, String stuId, String openId, String state) throws BaseException {
        qrCodeMapper.updateSignStudent(id,serial,stuId,openId,state);
    }
}
