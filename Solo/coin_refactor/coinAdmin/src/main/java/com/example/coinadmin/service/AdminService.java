package com.example.coinadmin.service;


import com.example.coinadmin.dto.*;
import com.example.coinadmin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminService {

    AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public int checkMember(Admin admin) {
        return adminRepository.checkMember(admin);
    }

    public int selectCntMember() {
        return adminRepository.selectCntMember();
    }

    public double selectAmountPayment() {
        return adminRepository.selectAmountPayment();
    }

    public int selectCntBuy() {
        return adminRepository.selectCntBuy();
    }

    public int selectCntContact() {
        return adminRepository.selectCntContact();
    }

    public ArrayList<Payment> selectPayment() {
        return adminRepository.selectPayment();
    }

    public ArrayList<Buy> selectBuy() {
        return adminRepository.selectBuy();
    }

    public ArrayList<Contact> selectContact() {
        return adminRepository.selectContact();
    }

    public ArrayList<Subscribe> selectSubscribe() {
        return adminRepository.selectSubscribe();
    }
}
