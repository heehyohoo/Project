package com.example.coin.page.Controller;


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

    @GetMapping("/goLogin")
    public String login(HttpSession session, Model model) {

        if (session.getAttribute("email") != null) {
            model.addAttribute("message", "현재 로그인 상태 입니다.");
            model.addAttribute("url", "/goMarket");
            return "message";
        }

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


}
