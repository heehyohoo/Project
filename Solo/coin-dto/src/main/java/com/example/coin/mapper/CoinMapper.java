package com.example.coin.mapper;


import com.example.coin.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Mapper
public interface CoinMapper {

    public int insertMember(Member member);

    public int checkUser(Member member);

    public int subscribe(String email);

    public int contact(@RequestParam HashMap<String,String> params);

    public int addPoint(@RequestParam HashMap<String,String>params);


}
