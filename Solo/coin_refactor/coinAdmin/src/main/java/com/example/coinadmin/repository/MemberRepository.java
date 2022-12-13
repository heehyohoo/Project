package com.example.coinadmin.repository;


import com.example.coinadmin.dto.Member;
import com.example.coinadmin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MemberRepository {

    MemberMapper memberMapper;


    @Autowired
    public MemberRepository(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public ArrayList<Member> selectMember() {
        return memberMapper.selectMember();
    }



}
