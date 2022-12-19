package com.example.coinadmin.admin.controller;


import com.example.coinadmin.dto.Admin;
import com.example.coinadmin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;


@Api(tags = {"어드민 로그인 관련"}, description = "로그인 체크 하는 컨트롤러")
@Controller
public class AdminController {


    AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @ApiOperation(value = "사용자별 인증 정보 CHECK", notes = "인증된 사용자인지 판단하는 API입니다.")
//    @ApiImplicitParams({
//    @ApiImplicitParam(name = "id", value = "사용자 식별 ID", required = true),
//    @ApiImplicitParam(name = "password", value = "사용자 비밀번호", required = true)
//    })
    @PostMapping("/login")
    public String login(Admin admin ,@ApiIgnore Model model, @ApiIgnore HttpSession session) {
        if(adminService.checkMember(admin) == 1) {
            model.addAttribute("url","/index");
            model.addAttribute("message","관리자님 환영합니다.");
            session.setAttribute("Id",admin.getId());
            return "message";
        }

        if(adminService.checkMember(admin) != 1) {
            model.addAttribute("url","/");
            model.addAttribute("message","id,password를 확인하세요.");
        }
        return "message";

    }
}
