package com.example.coin.repository;

import com.example.coin.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    CoinMapper cm;

    public int insertMember(@RequestParam HashMap<String, String> params) {
        return cm.insertMember(params);
    }

    public int checkUser(@RequestParam HashMap<String, String> params) {
        return cm.checkUser(params);
    }



}
