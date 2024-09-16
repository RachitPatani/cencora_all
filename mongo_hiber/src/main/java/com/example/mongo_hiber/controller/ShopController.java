package com.example.mongo_hiber.controller;

import com.example.mongo_hiber.model.User;
import com.example.mongo_hiber.repo.shoppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping-Service")
public class ShopController {
    @Autowired
    private shoppingRepo shoppingRepo;

    public ShopController(shoppingRepo shoppingRepo) {
        this.shoppingRepo = shoppingRepo;
    }

    @PostMapping("/orderPlace")
    private String placeOrder(@RequestBody User user) {
        shoppingRepo.save(user);
        return "Order placed successfully";
    }


    @GetMapping("/getUserByName/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return shoppingRepo.findByName(name);
    }

    @GetMapping("/getUserByCity/{city}")
    public List<User> getUserByCity(@PathVariable String city) {
        return shoppingRepo.findByCity(city);
    }
}

