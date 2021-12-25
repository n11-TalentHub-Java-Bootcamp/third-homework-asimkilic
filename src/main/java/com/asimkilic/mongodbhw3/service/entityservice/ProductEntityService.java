package com.asimkilic.mongodbhw3.service.entityservice;

import com.asimkilic.mongodbhw3.entity.Product;
import com.asimkilic.mongodbhw3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductEntityService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(String productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);

        Product product = null;
        if (optionalProduct.isPresent()) {
            product = optionalProduct.get();
        }
        return product;
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(String productId){
        productRepository.deleteById(productId);
    }

    public List<Product> findAllProductByCategoryId(String categoryId){
        return productRepository.findAllByCategoryId(categoryId);
    }
}
