package com.example.coin.controller.contact;

import com.example.coin.dto.Contact;
import com.example.coin.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/requestCall")
    public String requestCall(Contact contact, Model model) {

        contactService.insertContact(contact);
        model.addAttribute("message","연락요청이 완료 되었습니다.");
        model.addAttribute("url","/");
        return "message";
    }
}
