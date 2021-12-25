package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.dto.ProductDetailDto;
import com.asimkilic.mongodbhw3.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(String id);

    ProductDetailDto findProductDetailDtoById(String id);

    Product save(Product product);

    void deleteById(String id);

    List<ProductDetailDto> findAllProductByCategoryId(String categoryId);
}
