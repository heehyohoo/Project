package com.example.coin.service;


import com.example.coin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
}
