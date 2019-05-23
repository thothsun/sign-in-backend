package com.suns.signin.qrcode;

import java.util.List;

/**
 * Created by sunshuai on 2019/5/23
 */
public class SignResponse {
    private List<QrCode> qrCodes;

    public SignResponse() {
    }

    public SignResponse(List<QrCode> qrCodes) {
        this.qrCodes = qrCodes;
    }

    public List<QrCode> getQrCodes() {
        return qrCodes;
    }

    public void setQrCodes(List<QrCode> qrCodes) {
        this.qrCodes = qrCodes;
    }
}
