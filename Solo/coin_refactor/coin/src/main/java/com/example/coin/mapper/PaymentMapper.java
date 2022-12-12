package com.example.coin.mapper;


import com.example.coin.dto.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PaymentMapper {

    public int insertPoint(Payment payment);

    public ArrayList<Payment> selectPaymentHistory(String email);

}
