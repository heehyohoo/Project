package com.example.coin.repository;


import com.example.coin.dto.Payment;
import com.example.coin.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    PaymentMapper paymentMapper;

    @Autowired
    public PaymentRepository(PaymentMapper paymentMapper) {
        this.paymentMapper = paymentMapper;
    }

    public int insertPoint(Payment payment) {
        return paymentMapper.insertPoint(payment);
    }
}
