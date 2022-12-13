package com.example.coinadmin.dto;

public class Payment {

    private String id;
    private String email;
    private String amount;
    private String uid;
    private String indate;

    public Payment(String id, String email, String amount, String uid, String indate) {
        this.id = id;
        this.email = email;
        this.amount = amount;
        this.uid = uid;
        this.indate = indate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}
