package com.example.coin.repository;

import com.example.coin.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    CoinMapper mapper;

    public int insertMember(@RequestParam HashMap<String, String> params) {
        return mapper.insertMember(params);
    }

    public int checkUser(@RequestParam HashMap<String, String> params) {
        return mapper.checkUser(params);
    }

    public int subscribe(String email) {
        return mapper.subscribe(email);
    }

    public int contact(@RequestParam HashMap<String,String> params) {
        return mapper.contact(params);
    }
    public int addPoint(@RequestParam HashMap<String,String>params) {
        return mapper.addPoint(params);
    }



}
