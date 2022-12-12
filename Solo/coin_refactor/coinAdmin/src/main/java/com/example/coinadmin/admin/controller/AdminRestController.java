package com.example.coinadmin.admin.controller;


import com.example.coinadmin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminRestController {

    MemberService memberService;


    @Autowired
    public AdminRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/selectCntMember")
    public int selectCntMember() {
        return memberService.selectCountMember();
    }

    @GetMapping("/selectAmountPayment")
    public double selectAmountPayment() {
        return 1;
    }

    @GetMapping("/selectCntBuy")
    public int selectCntBuy() {
        return 1;
    }

    @GetMapping("/selectCntContact")
    public int selectCntContact() {
        return 1;
    }


}
