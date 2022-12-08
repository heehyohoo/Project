package com.example.coin.controller;


import com.example.coin.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Optional;
import java.util.OptionalDouble;

@RestController
public class CoinController {

    @Autowired
    CoinService cs;


    @GetMapping("/checkBalance")
    public String checkBalance(String total, HttpSession session) {

        String email = (String) session.getAttribute("email");

        double totalAmount = Double.parseDouble(cs.totalAmount(email)); // 내 총포인트

        Optional<String> optTotal = Optional.ofNullable(cs.totalPrice(email)); // 총 구매내역
        double totalPrice = (Double.valueOf(optTotal.orElse("0")));


        if (totalPrice < totalAmount) {
            return "can";
        }

        if (totalPrice > totalAmount) {
            return "cannot";
        }

        if (session.getAttribute("email") == null) {
        }
        return "login";

    }

    @PostMapping("/buyCoin")
    public String buyCoin(@RequestParam HashMap<String, String> params) {

        System.out.println(params);
        return "";
    }

    @PostMapping("/buyList")
    public String buyList() {
        return "";
    }

    @PostMapping("/pointList")
    public String pointList() {
        return "";
    }

    @PostMapping("/hadBalance")
    public String hadBalance() {
        return "";
    }

    @PostMapping("/havingBalance")
    public String havingBalance() {
        return "";
    }

}
