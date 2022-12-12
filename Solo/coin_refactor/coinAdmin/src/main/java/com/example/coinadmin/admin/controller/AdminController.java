package com.example.coinadmin.admin.controller;


import com.example.coinadmin.dto.Admin;
import com.example.coinadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {


    AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public String login(Admin admin, Model model) {
        if(adminService.checkMember(admin) == 1) {
            model.addAttribute("url","/index");
            model.addAttribute("message","관리자님 환영합니다.");
            return "message";
        }

        if(adminService.checkMember(admin) != 1) {
            model.addAttribute("url","/");
            model.addAttribute("message","id,password를 확인하세요.");
        }
        return "message";

    }
}
