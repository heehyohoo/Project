package com.example.coin.controller;

import com.example.coin.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.coin.service.MemberService;

@Controller
public class MemberController {

    MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public String signup(MemberDto member, Model model) {

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
}
