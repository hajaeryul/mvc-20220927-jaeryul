package com.study.mvc20220927jaeryul.controller.api;

import org.springframework.web.bind.annotation.GetMapping;

public class userTestRestApi {

    @GetMapping("/api/test/user/rest")
    public String GetUsername() {return "하재률";}

}
