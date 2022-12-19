package com.example.coinadmin.member.controller;


import com.example.coinadmin.dto.Member;
import com.example.coinadmin.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = {"실시간 정보"}, description = "로그인 화면에 레스트 컨트롤러중 총포인트")
@RestController
public class MemberRestController {

    MemberService memberService;
    @Autowired
    public MemberRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @ApiOperation(value = "총 포인트 판매량", notes = "총 포인트 판매량을 조회한다")
    @GetMapping("/selectMember")
    public ArrayList<Member> selectMember() {
        return memberService.selectMember();
    }

}
