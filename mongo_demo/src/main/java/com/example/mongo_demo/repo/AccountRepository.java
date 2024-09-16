package com.example.mongo_demo.repo;

import com.example.mongo_demo.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
