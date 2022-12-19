package com.example.coinadmin.dto;

import io.swagger.annotations.ApiModelProperty;

public class Admin {

    @ApiModelProperty(value = "아이디", example = "Id", required = true, dataType = "java.lang.String")
    private String id;
    @ApiModelProperty(value = "패스워드", example = "password", required = true, dataType = "java.lang.String")
    private String password;

    public Admin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public Admin() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
