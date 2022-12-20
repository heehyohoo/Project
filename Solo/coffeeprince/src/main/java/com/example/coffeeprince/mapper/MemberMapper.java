package com.example.coffeeprince.mapper;


import com.example.coffeeprince.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public int insertMember(Member member);
}
