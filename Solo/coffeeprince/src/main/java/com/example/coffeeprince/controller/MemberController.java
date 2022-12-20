package com.example.coffeeprince.controller;


import com.example.coffeeprince.Service.MemberService;
import com.example.coffeeprince.member.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


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

}
