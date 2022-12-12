package com.example.coin.controller.payment;


import com.example.coin.dto.Payment;
import com.example.coin.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class PaymentRestController {

    PaymentService paymentService;

    @Autowired
    public PaymentRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pointList")
    public ArrayList<Payment> pointList(HttpSession session) {
        return paymentService.selectPaymentHistory((String)session.getAttribute("email"));
    }
}
