package com.suns.signin.wechat;

import com.suns.signin.APICode;
import com.suns.signin.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunshuai on 2019/5/22
 */

@RestController
@RequestMapping(path = "/wechat")
public class WeChatController {

    @Autowired
    private WeChatService weChatService;

    @GetMapping(path = "/openid")
    @ResponseBody
    public Response getQrCodeSerial(@RequestParam("code") String code) {
        return new Response<>(APICode.SUCCESS, weChatService.getOpenId(code));
    }
}