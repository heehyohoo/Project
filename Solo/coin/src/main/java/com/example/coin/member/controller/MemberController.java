package com.example.coin.member.controller;

import com.example.coin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public String signup(@RequestParam HashMap<String, String> params, Model model) {
        System.out.println(params);
        ms.insertMember(params);
        model.addAttribute("message", "회원가입이 성공적으로 되었습니다.");
        model.addAttribute("url", "/");
        return "message";
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String, String> params, Model model, HttpSession session) {

        if (ms.checkUser(params) == 0) {
            model.addAttribute("message", "일치하는 회원이 없습니다.");
            model.addAttribute("url", "/goLogin");
            return "message";
        }

        if (ms.checkUser(params) == 1) {
            model.addAttribute("message", "로그인 성공!");
            model.addAttribute("url", "/goMarket");
            session.setAttribute("email", params);
        }
        return "message";
    }
}



