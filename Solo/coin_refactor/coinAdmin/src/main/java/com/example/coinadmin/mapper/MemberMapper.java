package com.example.coinadmin.mapper;

import com.example.coinadmin.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface MemberMapper {
    public ArrayList<Member>selectMember();

    public int selectCountMember();
}
