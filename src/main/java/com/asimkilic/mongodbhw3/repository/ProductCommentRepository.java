package com.asimkilic.mongodbhw3.repository;

import com.asimkilic.mongodbhw3.entity.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentRepository extends MongoRepository<ProductComment,String> {

    void deleteAllByUserId(String userId);
}
