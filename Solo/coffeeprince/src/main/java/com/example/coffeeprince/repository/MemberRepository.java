package com.example.coffeeprince.repository;


import com.example.coffeeprince.mapper.MemberMapper;
import com.example.coffeeprince.member.dto.Member;
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
}
