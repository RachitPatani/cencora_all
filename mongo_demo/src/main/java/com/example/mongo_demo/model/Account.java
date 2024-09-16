package com.example.mongo_demo.model;

import org.springframework.data.annotation.Id;

public class Account
{

    @Id
    private String accId;
    private String accNumber;
    private String accName;

    public Account(String accId, String accNumber, String accName) {
        this.accId = accId;
        this.accNumber = accNumber;
        this.accName = accName;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }
}
