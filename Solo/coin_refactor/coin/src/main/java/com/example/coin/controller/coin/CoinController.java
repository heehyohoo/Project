package com.example.coin.controller.coin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class CoinController {

    @GetMapping("/point")
    public String point(String amount, String uid) {


        return "";
    }
}
