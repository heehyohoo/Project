package com.example.coin.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Mapper
public interface CoinMapper {

    public int insertMember(@RequestParam HashMap<String, String> params);

    public int checkUser(@RequestParam HashMap<String, String> params);

    public int subscribe(String email);

    public int contact(@RequestParam HashMap<String,String> params);

    public int addPoint(@RequestParam HashMap<String,String>params);


}
