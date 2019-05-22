package com.suns.signin.qrcode;

/**
 * Created by sunshuai on 2019/5/22
 */
public class QrCode {
    private Integer serial;
    private String description;

    public QrCode() {
    }

    public QrCode(String description) {
        this.description = description;
    }

    public QrCode(Integer serial, String description) {
        this.serial = serial;
        this.description = description;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }
}
