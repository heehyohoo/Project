package com.example.coinadmin.page.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


@Controller
public class PageController {
    @GetMapping("/")
    public String main() {
        return "login";
    }

    @GetMapping("/index")
    public String index(HttpSession session) {


        return "index";
    }

    @GetMapping("/goMember")
    public String memberList() {
        return "memberList";
    }

}
