package com.example.coin.service;

import com.example.coin.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoinService {

    @Autowired
    CoinRepository cr;

    public String totalAmount(String email) {
        return cr.totalAmount(email);
    }

    public String totalPrice(String email) {
        return cr.totalPrice(email);
    }


}
