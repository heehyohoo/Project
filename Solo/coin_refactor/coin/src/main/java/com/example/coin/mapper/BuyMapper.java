package com.example.coin.mapper;

import com.example.coin.dto.Buy;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;


@Mapper
public interface BuyMapper {

    public String totalAmount(String email);
    public String buyTotal(String email);

    public int insertBuyHistory(Buy buy);
    public ArrayList<Buy> selectBuyHistory(String email);
    public ArrayList<Buy> selectBuyCoinId(String email);


}
