package com.example.coinadmin.mapper;

import com.example.coinadmin.dto.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    public int checkMember(Admin admin);

}
