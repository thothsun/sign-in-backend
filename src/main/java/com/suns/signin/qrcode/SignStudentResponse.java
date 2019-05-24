package com.suns.signin.qrcode;

import java.util.List;

/**
 * Created by sunshuai on 2019/5/24
 */
public class SignStudentResponse {
    private List<SignStudent> signStudents;

    public SignStudentResponse() {
    }

    public SignStudentResponse(List<SignStudent> signStudents) {
        this.signStudents = signStudents;
    }

    public List<SignStudent> getSignStudents() {
        return signStudents;
    }

    public void setSignStudents(List<SignStudent> signStudents) {
        this.signStudents = signStudents;
    }

    @Override
    public String toString() {
        return "SignStudentResponse{" +
                "signStudents=" + signStudents +
                '}';
    }
}
