package com.gts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @RequestMapping("/logout1")
    public String logout(HttpSession session) {
        session.invalidate();
        //这个是直接退出，走的是默认退出方式
        return "redirect:https://server.cas.com:8443/cas/logout";
    }

    @RequestMapping("/logout2")
    public String loginOut2(HttpSession session){
        //session.invalidate();
        //退出登录后，跳转到退成成功的页面，不走默认页面
        return "redirect:https://server.cas.com:8443/cas/logout?service=http://app2.server.cas.com:8081";
    }

}
