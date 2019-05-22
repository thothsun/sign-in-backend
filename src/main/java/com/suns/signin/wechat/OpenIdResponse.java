package com.suns.signin.wechat;

/**
 * Created by sunshuai on 2019/5/22
 */
public class OpenIdResponse {
    private String openid;

    public OpenIdResponse() {
    }

    public OpenIdResponse(String openid) {
        this.openid = openid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
