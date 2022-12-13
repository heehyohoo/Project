package com.example.coinadmin.repository;
import com.example.coinadmin.dto.*;
import com.example.coinadmin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AdminRepository {

    AdminMapper adminMapper;

    @Autowired
    public AdminRepository(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public int checkMember(Admin admin) {
        return adminMapper.checkMember(admin);
    }

    public int selectCntMember() {
        return adminMapper.selectCntMember();
    }

    public double selectAmountPayment() {
        return adminMapper.selectAmountPayment();
    }

    public int selectCntBuy() {
        return adminMapper.selectCntBuy();
    }

    public int selectCntContact() {
        return adminMapper.selectCntContact();
    }

    public ArrayList<Payment> selectPayment() {
        return adminMapper.selectPayment();
    }
    public ArrayList<Buy> selectBuy() {
        return adminMapper.selectBuy();
    }
    public ArrayList<Contact> selectContact() {
        return adminMapper.selectContact();
    }

    public ArrayList<Subscribe> selectSubscribe() {
        return adminMapper.selectSubscribe();
    }


}
