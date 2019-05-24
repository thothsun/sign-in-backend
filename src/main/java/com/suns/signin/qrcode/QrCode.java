package com.suns.signin.qrcode;

/**
 * Created by sunshuai on 2019/5/22
 */
public class QrCode {
    private Integer serial;
    private String description;
    private String teacher;

    public QrCode() {
    }

    public QrCode(String description) {
        this.description = description;
    }

    public QrCode(Integer serial, String description, String teacher) {
        this.serial = serial;
        this.description = description;
        this.teacher = teacher;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "QrCode{" +
                "serial=" + serial +
                ", description='" + description + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
