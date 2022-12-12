package com.example.coin.dto;

public class Buy {

    private String email;
    private String coinId;
    private String name;
    private String price;
    private String amount;
    private String total;
    private String indate;

    public Buy(String email, String coinId, String name, String price, String amount, String total, String indate) {
        this.email = email;
        this.coinId = coinId;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.total = total;
        this.indate = indate;
    }

    public Buy(String name, String amount, String total, String indate) {
        this.name = name;
        this.amount = amount;
        this.total = total;
        this.indate = indate;
    }

    public Buy(String coinId, String amount) {
        this.coinId = coinId;
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoinId() {
        return coinId;
    }

    public void setCoinId(String coinId) {
        this.coinId = coinId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}
