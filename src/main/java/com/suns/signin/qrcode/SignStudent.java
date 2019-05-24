package com.suns.signin.qrcode;

/**
 * Created by sunshuai on 2019/5/24
 */
public class SignStudent {
    private Integer id;
    private Integer qrcodeSerial;
    private String stuId;
    private String stuName;
    private String stuOpenId;
    private String state;

    public Integer getQrcodeSerial() {
        return qrcodeSerial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQrcodeSerial(Integer qrcodeSerial) {
        this.qrcodeSerial = qrcodeSerial;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuOpenId() {
        return stuOpenId;
    }

    public void setStuOpenId(String stuOpenId) {
        this.stuOpenId = stuOpenId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SignStudent{" +
                "id=" + id +
                ", qrcodeSerial=" + qrcodeSerial +
                ", stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuOpenId='" + stuOpenId + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
