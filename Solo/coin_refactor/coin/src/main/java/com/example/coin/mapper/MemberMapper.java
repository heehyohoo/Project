package com.example.coin.mapper;

import com.example.coin.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public int insertMember(MemberDto member);

    public int checkEmail(String email);
}
