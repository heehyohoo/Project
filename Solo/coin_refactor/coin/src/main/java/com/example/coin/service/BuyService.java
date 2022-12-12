package com.example.coin.service;

import com.example.coin.dto.Buy;
import com.example.coin.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BuyService {

    BuyRepository buyRepository;

    @Autowired
    public BuyService(BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public String totalAmount(String email) {
        return buyRepository.totalAmount(email);
    }

    public String buyTotal(String email) {
        return buyRepository.buyTotal(email);
    }

    public String balanceCheck(double total, double balance, HttpSession session) {
        String result ="";

        if (balance > total) {
            result = "can";
        }
        if (balance < total) {
            result = "cannot";
        }
        if (session.getAttribute("email") == null) {
            result = "login";
        }

        return result;
    }
    public double calcBalance(double totalAmount, double buyTotal) {
        return totalAmount - buyTotal;

    }

    public int insertBuyHistory(Buy buy) {
        return buyRepository.insertBuyHistory(buy);
    }

    public ArrayList<Buy> selectBuyHistory(String email) {
        return buyRepository.selectBuyHistory(email);
    }

    public ArrayList<Buy>  selectBuyCoinId(String email) {
        return buyRepository.selectBuyCoinId(email);
    }
}
