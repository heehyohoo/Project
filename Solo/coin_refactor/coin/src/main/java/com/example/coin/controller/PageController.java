package com.example.coin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goSignup")
    public String signup() {
        return "signup";
    }

    @GetMapping("goLogin")
    public String login() {
        return "login";
    }

    @GetMapping("/goPay")
    public String pay() {
        return "pay";
    }

    @GetMapping("/goMarket")
    public String market() {
        return "market";
    }

    @GetMapping("/goHistory")
    public String history() {
        return "history";
    }

    @GetMapping("/Logout")
    public String logout(HttpSession session, Model model) {

        session.setAttribute("email",null);
        model.addAttribute("message", "로그아웃 되었습니다.");
        model.addAttribute("url", "/");
        return "message";
    }

}
