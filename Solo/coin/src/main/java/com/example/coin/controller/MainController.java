package com.example.coin.controller;


import com.example.coin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MainController {

    @Autowired
    MemberService ms;

    @GetMapping("/subscribe")
    public String subscribe(String email , Model model) {

        ms.subscribe(email);
        model.addAttribute("message", "구독완료!");
        model.addAttribute("url", "/");
        return "message";
    }

    @PostMapping("/requestCall")
    public String requestCall(@RequestParam HashMap<String,String> params, Model model) {
        ms.contact(params);
        model.addAttribute("message", "연락요청 완료.");
        model.addAttribute("url", "/");
        return "message";

    }

    @GetMapping("/point")
    public String point(@RequestParam HashMap<String,String> params, HttpSession session,Model model) {
        params.put("email",(String)session.getAttribute("email"));
        ms.addPoint(params);
        return "message";
    }
}
