package com.example.mongo_demo.controller;


import com.example.mongo_demo.model.Account;
import com.example.mongo_demo.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class AccoutController {
    @Autowired
    private AccountRepository accoutRepository;
    @PostMapping("/addAccount")
    public Account addAccount(@RequestBody Account account)
    {
        return  accoutRepository.save(account);
    }
    @GetMapping("/getAccount")
    public List<Account> getAccoutDetails()
    {
        return accoutRepository.findAll();
    }

}
