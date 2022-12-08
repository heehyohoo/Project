package com.example.coin.controller;

import com.example.coin.dto.RequestCallDto;
import com.example.coin.service.RequestCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RequestCallController {

    RequestCallService requestCallService;

    @Autowired
    public RequestCallController(RequestCallService requestCallService) {
        this.requestCallService = requestCallService;
    }

    @PostMapping("/requestCall")
    public String requestCall(RequestCallDto requestCallDto, Model model) {

        requestCallService.insertContact(requestCallDto);
        model.addAttribute("message","연락요청이 완료 되었습니다.");
        model.addAttribute("url","/");
        return "message";
    }
}
