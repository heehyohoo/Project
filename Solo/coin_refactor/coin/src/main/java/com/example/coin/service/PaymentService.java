package com.example.coin.service;


import com.example.coin.dto.Payment;
import com.example.coin.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public int insertPoint(Payment payment) {
        return paymentRepository.insertPoint(payment);
    }
}
