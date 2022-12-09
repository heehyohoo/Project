package com.example.coin.controller.payment;

import com.example.coin.dto.Payment;
import com.example.coin.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


@Controller
public class PaymentController {


    PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/point")
    public String insertPoint(Payment payment , HttpSession session) {
        payment.setEmail((String) session.getAttribute("email"));
        paymentService.insertPoint(payment);
        return "market";
    }
}
