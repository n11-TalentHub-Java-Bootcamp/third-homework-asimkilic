package com.asimkilic.mongodbhw3.repository;

import com.asimkilic.mongodbhw3.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}