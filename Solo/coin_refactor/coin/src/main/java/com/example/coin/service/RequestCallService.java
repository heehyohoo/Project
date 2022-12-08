package com.example.coin.service;


import com.example.coin.dto.RequestCall;
import com.example.coin.repository.RequestCallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestCallService {

    RequestCallRepository requestCallRepository;

    @Autowired
    public RequestCallService(RequestCallRepository requestCallRepository) {
        this.requestCallRepository = requestCallRepository;
    }

    public int insertContact(RequestCall requestCall) {
        return requestCallRepository.insertContact(requestCall);
    }
}
