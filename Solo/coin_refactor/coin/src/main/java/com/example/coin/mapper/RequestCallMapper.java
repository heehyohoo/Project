package com.example.coin.mapper;


import com.example.coin.dto.RequestCallDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RequestCallMapper {

    public int insertContact(RequestCallDto requestCallDto);


}
