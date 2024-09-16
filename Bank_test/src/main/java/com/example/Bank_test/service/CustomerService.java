package com.example.Bank_test.service;


import com.example.Bank_test.entity.Customer;
import com.example.Bank_test.repository.CustomerRepo;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerService {
    //No need to use @Autowired when using Constructor Injection
    //Dependencies are final
    private final CustomerRepo repo;

    public CustomerService(CustomerRepo repo) {
        this.repo = repo;
    }
    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }
}
