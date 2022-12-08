package com.example.coin.repository;


import com.example.coin.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoinRepository {

    @Autowired
    CoinMapper mapper;

    public String totalAmount(String email) {
        return mapper.totalAmount(email);
    }

    public String totalPrice(String email) {
        return mapper.totalPrice(email);
    }

}
