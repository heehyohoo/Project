package com.example.coinadmin.service;


import com.example.coinadmin.dto.Member;
import com.example.coinadmin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberService {

    MemberRepository memberRepository;


    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public ArrayList<Member> selectMember() {
        return memberRepository.selectMember();
    }

    public int selectCountMember() {
        return memberRepository.selectCountMember();
    }
}
