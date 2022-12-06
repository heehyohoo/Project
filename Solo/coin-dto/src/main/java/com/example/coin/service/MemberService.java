package com.example.coin.service;


import com.example.coin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public int insertMember(@RequestParam HashMap<String, String> params) {
        return mr.insertMember(params);
    }
    public int checkUser(@RequestParam HashMap<String, String> params) {
        return mr.checkUser(params);
    }

    public int subscribe(String email) {
        return mr.subscribe(email);
    }

    public int contact(@RequestParam HashMap<String,String> params) {
        return mr.contact(params);
    }

    public int addPoint(@RequestParam HashMap<String,String>params) {
        return mr.addPoint(params);
    }
}
