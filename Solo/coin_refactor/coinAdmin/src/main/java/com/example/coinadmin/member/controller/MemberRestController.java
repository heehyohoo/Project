package com.example.coinadmin.member.controller;


import com.example.coinadmin.dto.Member;
import com.example.coinadmin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MemberRestController {

    MemberService memberService;
    @Autowired
    public MemberRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/selectMember")
    public ArrayList<Member> selectMember() {
        return memberService.selectMember();
    }

}
