package com.example.coin.repository;

import com.example.coin.dto.Member;
import com.example.coin.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    CoinMapper cm;

    public int insertMember(Member member) {
        return cm.insertMember(member);
    }

    public int checkUser(Member member) {
        return cm.checkUser(member);
    }

    public int subscribe(String email) {
        return cm.subscribe(email);
    }

    public int contact(@RequestParam HashMap<String,String> params) {
        return cm.contact(params);
    }
    public int addPoint(@RequestParam HashMap<String,String>params) {
        return cm.addPoint(params);
    }



}
