package com.suns.signin.qrcode;

/**
 * Created by sunshuai on 2019/5/22
 */
public class Student {
    private String stuID;
    private String stuName;

    public Student() {
    }

    public Student(String stuID, String stuName) {
        this.stuID = stuID;
        this.stuName = stuName;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
