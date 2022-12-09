package com.example.coin.mapper;


import com.example.coin.dto.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {

    public int insertPoint(Payment payment);

}
