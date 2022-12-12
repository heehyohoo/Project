package com.example.coinadmin.repository;
import com.example.coinadmin.dto.Admin;
import com.example.coinadmin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
