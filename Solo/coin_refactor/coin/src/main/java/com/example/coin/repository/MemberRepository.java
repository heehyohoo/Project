package com.example.coin.repository;


import com.example.coin.dto.Member;
import com.example.coin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    MemberMapper memberMapper;

    @Autowired
    public MemberRepository(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public int insertMember(Member member) {
        return memberMapper.insertMember(member);
    }

    public int checkEmail(String email) {
        return memberMapper.checkEmail(email);
    }
    public int checkMember(Member member) {
        return memberMapper.checkMember(member);
    }
}
