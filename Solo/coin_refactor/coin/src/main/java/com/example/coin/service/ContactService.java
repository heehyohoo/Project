package com.example.coin.service;
import com.example.coin.dto.Contact;
import com.example.coin.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public int insertContact(Contact contact) {
        return contactRepository.insertContact(contact);
    }
}
