package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.dto.ProductDetailDto;
import com.asimkilic.mongodbhw3.dto.create.ProductCreateDto;
import com.asimkilic.mongodbhw3.dto.read.ProductReadDto;
import com.asimkilic.mongodbhw3.entity.Product;

import java.util.List;

public interface ProductService {
    List<ProductReadDto> findAll();

    ProductReadDto findById(String id);

    ProductDetailDto findProductDetailDtoById(String id);

    ProductReadDto save(ProductCreateDto productCreateDto);

    void deleteById(String id);

    List<ProductDetailDto> findAllProductByCategoryId(String categoryId);
}
