package com.suns.signin.qrcode;

/**
 * Created by sunshuai on 2019/5/24
 */
public class SignStudentRequestBody {
    private String id;
    private String serial;
    private String stuId;
    private String openId;
    private String state;

    public String getSerial() {
        return serial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
