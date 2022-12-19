package com.example.coinadmin.admin.controller;


import com.example.coinadmin.dto.Buy;
import com.example.coinadmin.dto.Contact;
import com.example.coinadmin.dto.Payment;
import com.example.coinadmin.dto.Subscribe;
import com.example.coinadmin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@Api(tags = {"관리자서비스"}, description = "관리자 관련 서비스")
@RestController
public class AdminRestController {

    AdminService adminService;



    @Autowired
    public AdminRestController(AdminService adminService) {
        this.adminService = adminService;
    }


    @ApiOperation(value = "총회원수", notes = "총회원수 반환 레스트 컨트롤러")
    @GetMapping("/selectCntMember")
    public int selectCntMember () {
        return adminService.selectCntMember();
    }

    @ApiOperation(value = "총결제금액", notes = "총결제금액 반환 레스트 컨트롤러")
    @GetMapping("/selectAmountPayment")
    public double selectAmountPayment() {
        return adminService.selectAmountPayment();
    }

    @ApiOperation(value = "총구매건수", notes = "총구매건수 반환 레스트 컨트롤러")
    @GetMapping("/selectCntBuy")
    public int selectCntBuy() {
        return adminService.selectCntBuy();
    }

    @ApiOperation(value = "연락요청 건수", notes = "연락요청건수 반환 레스트 컨트롤러")
    @GetMapping("/selectCntContact")
    public int selectCntContact() {
        return adminService.selectCntContact();
    }

    @ApiOperation(value = "결재목록", notes = "결재목록 반환 레스트 컨트롤러")
    @GetMapping("/selectPayment")
    public ArrayList<Payment> selectPayment() {
        return adminService.selectPayment();
    }

    @ApiOperation(value = "구매목록", notes = "구매목록 반환 레스트 컨트롤러")
    @GetMapping("/selectBuy")
    public ArrayList<Buy> selectBuy() {
        return adminService.selectBuy();
    }

    @ApiOperation(value = "총구독수", notes = "연락요청목록 반환 레스트 컨트롤러")
    @GetMapping("/selectContact")
    public ArrayList<Contact> selectContact() {
        return adminService.selectContact();
    }

    @ApiOperation(value = "구독목록", notes = "구독목록리스트 반환 레스트 컨트롤러")
    @GetMapping("/selectSubscribe")
    public ArrayList<Subscribe> selectSubscribe() {
        return adminService.selectSubscribe();
    }



}
