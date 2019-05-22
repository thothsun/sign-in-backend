package com.suns.signin.wechat;

import com.google.gson.Gson;
import com.suns.signin.qrcode.SerialResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunshuai on 2019/5/22
 */
@Service
public class WeChatService {

    public OpenIdResponse getOpenId(String code) {
        String APPID = "wx8e8505e21b9ba578";
        String SECRET = "48ae154dd7452851b7f2b40c46dc3170";
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + APPID + "&secret=" + SECRET + "&js_code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        Gson gson = new Gson();
        OpenIdResponse openIdResponse = gson.fromJson(entity.getBody(), OpenIdResponse.class);
        System.out.println(openIdResponse.getOpenid());
        return new OpenIdResponse(openIdResponse.getOpenid());
    }
}
