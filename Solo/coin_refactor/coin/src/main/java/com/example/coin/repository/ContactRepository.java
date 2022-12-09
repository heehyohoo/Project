package com.example.coin.repository;


import com.example.coin.dto.Contact;
import com.example.coin.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {

    ContactMapper contactMapper;

    @Autowired
    public ContactRepository(ContactMapper contactMapper) {
        this.contactMapper = contactMapper;
    }

    public int insertContact(Contact contact) {
        return contactMapper.insertContact(contact);
    }
}
