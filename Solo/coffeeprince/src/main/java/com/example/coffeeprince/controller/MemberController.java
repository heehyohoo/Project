package com.example.coffeeprince.controller;


import com.example.coffeeprince.Service.MemberService;
import com.example.coffeeprince.member.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class MemberController {


    MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public String signup(Member member) {
       memberService.insertMember(member);
       return "1";
    }

    @PostMapping("/login")
    public Member login(Member member) {
        if(memberService.checkIdPw(member) == 1) {
            return member;
        }else{
            return null;
        }
    }

}
