package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.converter.ProductCommentConverter;
import com.asimkilic.mongodbhw3.dto.create.ProductCommentCreateDto;
import com.asimkilic.mongodbhw3.dto.read.ProductCommentReadDto;
import com.asimkilic.mongodbhw3.dto.read.ProductReadDto;
import com.asimkilic.mongodbhw3.dto.read.UserReadDto;
import com.asimkilic.mongodbhw3.entity.ProductComment;
import com.asimkilic.mongodbhw3.service.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.asimkilic.mongodbhw3.converter.ProductCommentConverter.INSTANCE;

@Service
public class ProductCommentServiceImpl implements ProductCommentService {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @Override
    public List<ProductCommentReadDto> findAll() {
        List<ProductComment> productCommentList = productCommentEntityService.findAll();
        List<ProductCommentReadDto> productCommentReadDtoList = INSTANCE.convertProductCommentListToProductCommentReadDtoList(productCommentList);
        return productCommentReadDtoList;
    }

    @Override
    public ProductCommentReadDto findById(String id) {
        ProductComment productComment = productCommentEntityService.findById(id);
        ProductCommentReadDto productCommentReadDto = INSTANCE.convertProductCommentToProductCommentReadDto(productComment);
        ProductReadDto productReadDto = productService.findById(productComment.getProductId());
        productCommentReadDto.setProduct(productReadDto);
        UserReadDto userReadDto = userService.findById(productComment.getUserId());
        productCommentReadDto.setUser(userReadDto);
        return productCommentReadDto;
    }

    @Override
    public ProductCommentReadDto save(ProductCommentCreateDto productCommentCreateDto) {
        ProductComment productComment = INSTANCE.convertProductCommentCreateDtoToProductComment(productCommentCreateDto);
        productComment = productCommentEntityService.save(productComment);
        ProductCommentReadDto productCommentReadDto = INSTANCE.convertProductCommentToProductCommentReadDto(productComment);
        return productCommentReadDto;
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
    public void delete(ProductCommentReadDto productCommentReadDto) {
        productCommentEntityService.deleteById(productCommentReadDto.getId());
    }
}
