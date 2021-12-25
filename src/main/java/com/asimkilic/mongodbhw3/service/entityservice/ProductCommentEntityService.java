package com.asimkilic.mongodbhw3.service.entityservice;

import com.asimkilic.mongodbhw3.entity.ProductComment;
import com.asimkilic.mongodbhw3.repository.ProductCommentRepository;
import com.asimkilic.mongodbhw3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentRepository productCommentRepository;

    public List<ProductComment> findAll() {
        return productCommentRepository.findAll();
    }

    public ProductComment findById(String id) {
        ProductComment productComment = null;

        Optional<ProductComment> commentOptional = productCommentRepository.findById(id);
        if (commentOptional.isPresent()) {
            productComment = commentOptional.get();
        }

        return productComment;
    }

    public ProductComment save(ProductComment productComment) {
        return productCommentRepository.save(productComment);
    }

    public void deleteById(String id) {

        productCommentRepository.deleteById(id);
    }

    public void delete(ProductComment productComment) {
        productCommentRepository.delete(productComment);
    }

    public void deleteAllByUserId(String userId) {
        productCommentRepository.deleteAllByUserId(userId);
    }
}
