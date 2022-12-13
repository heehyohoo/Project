package com.example.coinadmin.admin.controller;


import com.example.coinadmin.dto.Buy;
import com.example.coinadmin.dto.Contact;
import com.example.coinadmin.dto.Payment;
import com.example.coinadmin.dto.Subscribe;
import com.example.coinadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminRestController {

    AdminService adminService;

    @Autowired
    public AdminRestController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/selectCntMember")
    public int selectCntMember () {
        return adminService.selectCntMember();
    }

    @GetMapping("/selectAmountPayment")
    public double selectAmountPayment() {
        return adminService.selectAmountPayment();
    }

    @GetMapping("/selectCntBuy")
    public int selectCntBuy() {
        return adminService.selectCntBuy();
    }

    @GetMapping("/selectCntContact")
    public int selectCntContact() {
        return adminService.selectCntContact();
    }

    @GetMapping("/selectPayment")
    public ArrayList<Payment> selectPayment() {
        return adminService.selectPayment();
    }

    @GetMapping("/selectBuy")
    public ArrayList<Buy> selectBuy() {
        return adminService.selectBuy();
    }

    @GetMapping("/selectContact")
    public ArrayList<Contact> selectContact() {
        return adminService.selectContact();
    }

    @GetMapping("/selectSubscribe")
    public ArrayList<Subscribe> selectSubscribe() {
        return adminService.selectSubscribe();
    }



}
