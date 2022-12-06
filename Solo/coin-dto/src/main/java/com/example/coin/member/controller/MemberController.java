package com.example.coin.member.controller;

import com.example.coin.dto.Member;
import com.example.coin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public String signup(Member member, Model model) {
        System.out.println(member);

        if (ms.checkUser(member) == 1) {
            model.addAttribute("message", "이메일이 중복 입니다.");
            model.addAttribute("url", "/goSignup");
            return "message";
        }

        ms.insertMember(member);
        model.addAttribute("message", "회원가입이 성공적으로 되었습니다.");
        model.addAttribute("url", "/");
        return "message";
    }

    @PostMapping("/login")
    public String login(Member member, Model model, HttpSession session) {

        if (ms.checkUser(member) == 0) {
            model.addAttribute("message", "일치하는 회원이 없습니다.");
            model.addAttribute("url", "/goLogin");
            return "message";
        }

        if (ms.checkUser(member) == 1) {
            model.addAttribute("message", "로그인 성공!");
            model.addAttribute("url", "/goMarket");
            session.setAttribute("email", member.getEmail());
        }
        return "message";
    }
}



