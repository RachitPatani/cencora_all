package com.example.Bank_test.controller;



import com.example.Bank_test.entity.Customer;
import com.example.Bank_test.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class CustomerController {
    private final CustomerService customerService;
    //custructor based injection no need of autowiring
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers()
    {
        return  ResponseEntity.ok(customerService.getAllCustomer());
    }
}

