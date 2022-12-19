package com.example.coinadmin.page.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
@Api(tags = {"관리자 페이지"}, description = "페이지 컨트롤러")
@Controller
public class PageController {

    @ApiOperation(value = "메인페이지로 이동", notes = "기본 페이지는 로그인 페이지 입니다.")
    @GetMapping("/")
    public String main() {
        return "login";
    }

    @ApiOperation(value = "로그인 인덱스 페이지", notes = "로그인하면 보여지는 인덱스 페이지")
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @ApiOperation(value = "회원관리에 회원목록보기", notes = "회원목록 보기")
    @GetMapping("/goMember")
    public String memberList() {
        return "memberList";
    }


    @ApiOperation(value = "회원관리에 결재목록보기", notes = "결재목록 보기")
    @GetMapping("/goPayment")
    public String payment() {
        return "paymentList";
    }


    @ApiOperation(value = "회원관리에 구매목록보기", notes = "구매목록 보기")
    @GetMapping("/goBuy")
    public String buyList() {
        return "buyList";
    }

    @ApiOperation(value = "기타관리에 연락요청목록보기", notes = "연락요청목록 보기")
    @GetMapping("goContact")
    public String contactList() {
        return "contactList";
    }

    @ApiOperation(value = "기타관리에 구독목록보기", notes = "구독목록 보기")
    @GetMapping("/goSubscribe")
    public String subscribeList() {
        return "subscribeList";
    }

    @ApiOperation(value = "로그아웃", notes = "세션에 Id 값을 null로 지정")
    @GetMapping("/logout")
    public String logout(@ApiIgnore HttpSession session) {
        session.setAttribute("Id", null);
        return "login";
    }

}
