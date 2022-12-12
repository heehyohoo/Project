package com.example.coin.controller.buy;

import com.example.coin.dto.Buy;
import com.example.coin.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
public class BuyController {

    BuyService buyService;


    @Autowired
    public BuyController(BuyService buyService) {
        this.buyService = buyService;
    }

    @GetMapping("/checkBalance")
    public String checkBalance(double total, HttpSession session) {
        double totalAmount = Double.parseDouble(buyService.totalAmount((String) session.getAttribute("email")));
        Optional<String> optBuyTotal = Optional.ofNullable(buyService.buyTotal((String) session.getAttribute("email")));
        double buyTotal = Double.parseDouble(optBuyTotal.orElse("0"));
        double balance = buyService.calcBalance(totalAmount,buyTotal);
        return buyService.balanceCheck(total,balance,session);

    }

    @PostMapping("/buyCoin")
    public String buyCoin(Buy buy, HttpSession session) {
        buy.setEmail((String) session.getAttribute("email"));
        buyService.insertBuyHistory(buy);
        return "/goMarket";

    }

    @GetMapping("/buyList")
    public ArrayList<Buy> buyList(HttpSession session) {
        return buyService.selectBuyHistory((String) session.getAttribute("email"));
    }

    @GetMapping("/hadBalance")
    public double hadBalance(HttpSession session) {
        Optional<String> optBuyTotal = Optional.ofNullable(buyService.buyTotal((String) session.getAttribute("email")));
        return Double.parseDouble(optBuyTotal.orElse("0"));
    }

    @GetMapping("/havingBalance")
    public ArrayList<Buy>havingBalance(HttpSession session) {

        return buyService.selectBuyCoinId((String)session.getAttribute("email"));
    }


    @GetMapping("/moneyBalance")
    public double moneyBalance(HttpSession session) {
        double totalAmount = Double.parseDouble(buyService.totalAmount((String) session.getAttribute("email")));
        Optional<String> optBuyTotal = Optional.ofNullable(buyService.buyTotal((String) session.getAttribute("email")));
        double buyTotal = Double.parseDouble(optBuyTotal.orElse("0"));
        return buyService.calcBalance(totalAmount,buyTotal);
    }
}
