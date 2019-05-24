package com.suns.signin.qrcode;

import java.util.List;

/**
 * Created by sunshuai on 2019/5/24
 */
public class SignRequestBody {
    private QrCode qrCode;
    private List<Student> students;

    public QrCode getQrCode() {
        return qrCode;
    }

    public void setQrCode(QrCode qrCode) {
        this.qrCode = qrCode;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
