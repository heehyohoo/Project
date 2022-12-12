package com.example.coin.repository;

import com.example.coin.dto.Buy;
import com.example.coin.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class BuyRepository {

    BuyMapper buyMapper;

    @Autowired
    public BuyRepository(BuyMapper buyMapper) {
        this.buyMapper = buyMapper;
    }

    public String totalAmount(String email){
        return buyMapper.totalAmount(email);
    }

    public String buyTotal(String email) {
        return buyMapper.buyTotal(email);
    }

    public int insertBuyHistory(Buy buy) {
        return buyMapper.insertBuyHistory(buy);
    }

    public ArrayList<Buy> selectBuyHistory(String email) {
        return buyMapper.selectBuyHistory(email);
    }

    public ArrayList<Buy> selectBuyCoinId(String email) {
        return buyMapper.selectBuyCoinId(email);
    }
}
