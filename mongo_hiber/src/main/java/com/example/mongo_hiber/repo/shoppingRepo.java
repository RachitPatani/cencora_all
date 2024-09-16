package com.example.mongo_hiber.repo;

import com.example.mongo_hiber.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import java.util.List;

public interface shoppingRepo extends MongoRepository<User, Integer> {
    List<User> findByName(String name);

    @Query("{'Address.city':?0}")
    List<User> findByCity(String city);

//    @Update
//    @Query(value = "{ 'id': ?0 }", update = "{ '$set': { 'name': ?1 } }")
//    void updateUserEmailById(String id, String name);
}

