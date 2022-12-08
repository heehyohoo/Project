package com.example.coin.mapper;

import com.example.coin.dto.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public int insertMember(Member member);

    public int checkEmail(String email);

    public int checkMember(Member member);
}
