package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.entity.ProductComment;

import java.util.List;

public interface ProductCommentService {

    List<ProductComment> findAll();
    ProductComment findById(String id);

    ProductComment save(ProductComment productComment);

    void deleteAllByUserId(String userId);
    void deleteById(String id);
    void delete(ProductComment productComment);
}
