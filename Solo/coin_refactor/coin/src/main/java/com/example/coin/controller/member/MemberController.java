package com.example.coin.controller.member;

import com.example.coin.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.coin.service.MemberService;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {

    MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public String signup(Member member, Model model) {

        if (memberService.checkEmail(member.getEmail()) == 1) {
            model.addAttribute("message","중복된 이메일 입니다.");
            model.addAttribute("url","/");
            return "message2";
        }

        memberService.insertMember(member);
        model.addAttribute("message","회원가입 완료.");
        model.addAttribute("url","/");
        return "message";
    }

    @PostMapping("/login")
    public String login(Member member, Model model, HttpSession session) {

        if(memberService.checkMember(member) == 1) {
            session.setAttribute("email",member.getEmail());
            model.addAttribute("message", "환영합니다!");
            model.addAttribute("url", "/goMarket");
            return "message";
        }

        if(memberService.checkMember(member) == 0) {
            model.addAttribute("message", "일치하는 아이디가 없습니다.");
            model.addAttribute("url", "/goLogin");
        }
        return "message";
    }
}
