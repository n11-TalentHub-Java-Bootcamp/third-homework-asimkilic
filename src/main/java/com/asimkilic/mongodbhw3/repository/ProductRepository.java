package com.asimkilic.mongodbhw3.repository;


import com.asimkilic.mongodbhw3.dto.ProductDetailDto;
import com.asimkilic.mongodbhw3.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends MongoRepository<Product, String> {


    List<Product> findAllByCategoryId(String categoryId);

    ProductDetailDto findProductDetailDtoById(String id);
}
