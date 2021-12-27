package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.dto.create.ProductCommentCreateDto;
import com.asimkilic.mongodbhw3.dto.read.ProductCommentReadDto;
import com.asimkilic.mongodbhw3.entity.ProductComment;

import java.util.List;

public interface ProductCommentService {

    List<ProductCommentReadDto> findAll();
    ProductCommentReadDto findById(String id);

    ProductCommentReadDto save(ProductCommentCreateDto productCommentCreateDto);

    void deleteAllByUserId(String userId);
    void deleteById(String id);
    void delete(ProductCommentReadDto productCommentReadDto);
}
