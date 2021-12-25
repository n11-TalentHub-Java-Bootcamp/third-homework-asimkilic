package com.asimkilic.mongodbhw3.repository;


import com.asimkilic.mongodbhw3.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}