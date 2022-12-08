package com.example.coin.mapper;


import com.example.coin.dto.RequestCall;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RequestCallMapper {

    public int insertContact(RequestCall requestCall);


}
