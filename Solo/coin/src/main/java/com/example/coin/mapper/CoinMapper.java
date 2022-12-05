package com.example.coin.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Mapper
public interface CoinMapper {

    public int insertMember(@RequestParam HashMap<String, String> params);

    public int checkUser(@RequestParam HashMap<String, String> params);


}
