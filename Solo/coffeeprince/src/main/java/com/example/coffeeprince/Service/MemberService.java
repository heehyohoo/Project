package com.example.coffeeprince.Service;

import com.example.coffeeprince.member.dto.Member;
import com.example.coffeeprince.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {

    MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public int insertMember(Member member) {
        return memberRepository.insertMember(member);
    }

    public int checkIdPw(Member member) {
        return memberRepository.checkIdPw(member);
    }
}
