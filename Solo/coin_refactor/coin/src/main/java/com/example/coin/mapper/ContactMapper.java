package com.example.coin.mapper;


import com.example.coin.dto.Contact;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactMapper {

    public int insertContact(Contact contact);


}
