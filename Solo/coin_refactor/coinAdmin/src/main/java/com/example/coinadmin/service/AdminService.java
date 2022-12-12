package com.example.coinadmin.service;


import com.example.coinadmin.dto.Admin;
import com.example.coinadmin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
