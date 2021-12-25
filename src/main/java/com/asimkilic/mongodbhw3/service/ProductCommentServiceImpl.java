package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.entity.ProductComment;
import com.asimkilic.mongodbhw3.service.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCommentServiceImpl implements ProductCommentService {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;

    @Override
    public List<ProductComment> findAll() {
        return productCommentEntityService.findAll();
    }

    @Override
    public ProductComment findById(String id) {
        return productCommentEntityService.findById(id);
    }

    @Override
    public ProductComment save(ProductComment productComment) {
        return productCommentEntityService.save(productComment);
    }

    @Override
    public void deleteAllByUserId(String userId) {
        productCommentEntityService.deleteAllByUserId(userId);
    }

    @Override
    public void deleteById(String id) {
        productCommentEntityService.deleteById(id);
    }

    @Override
    public void delete(ProductComment productComment) {
        productCommentEntityService.delete(productComment);
    }
}
