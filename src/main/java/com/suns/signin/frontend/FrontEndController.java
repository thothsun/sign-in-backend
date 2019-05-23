package com.suns.signin.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunshuai on 2019/5/23
 */
@Controller
public class FrontEndController {

    @GetMapping(path = "/")
    public String login(){
        return "login";
    }

    @GetMapping(path = "/manage")
    public String manage(){
        return "manage";
    }

}
