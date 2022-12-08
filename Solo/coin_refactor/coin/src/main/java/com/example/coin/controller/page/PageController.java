package com.example.coin.controller.page;


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
    public String login(HttpSession session,Model model) {

        if(session.getAttribute("email") != null) {
            model.addAttribute("message", "현재 로그인 상태 입니다.");
            model.addAttribute("url", "/goMarket");
            return "message";
        }

        if(session.getAttribute("email") == null) {

        }
        return "login";

    }

    @GetMapping("/goPay")
    public String pay() {
        return "pay";
    }

    @GetMapping("/goMarket")
    public String market(HttpSession session,Model model) {

        if(session.getAttribute("email") != null) {
            return "market";
        }

        if(session.getAttribute("email") == null) {
            model.addAttribute("message", "로그인 상태가 아닙니다.");
            model.addAttribute("url", "/goLogin");
        }
        return "message";


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
