package com.example.coinadmin.mapper;

import com.example.coinadmin.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AdminMapper {

    public int checkMember(Admin admin);
    public int selectCntMember();
    public double selectAmountPayment();
    public int selectCntBuy();
    public int selectCntContact();
    public ArrayList<Payment> selectPayment();
    public ArrayList<Buy> selectBuy();
    public ArrayList<Contact> selectContact();
    public ArrayList<Subscribe> selectSubscribe();
}
