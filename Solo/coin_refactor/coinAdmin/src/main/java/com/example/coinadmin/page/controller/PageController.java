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
    public String index() {
        return "index";
    }

    @GetMapping("/goMember")
    public String memberList() {
        return "memberList";
    }

    @GetMapping("/goPayment")
    public String payment() {
        return "paymentList";
    }

    @GetMapping("/goBuy")
    public String buyList() {
        return "buyList";
    }

    @GetMapping("goContact")
    public String contactList() {
        return "contactList";
    }

    @GetMapping("/goSubscribe")
    public String subscribeList() {
        return "subscribeList";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.setAttribute("Id", "null");
        return "login";
    }

}
