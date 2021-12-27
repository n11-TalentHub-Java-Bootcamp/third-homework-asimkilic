package com.asimkilic.mongodbhw3.controller;

import com.asimkilic.mongodbhw3.dto.create.ProductCommentCreateDto;
import com.asimkilic.mongodbhw3.dto.create.UserCreateDto;
import com.asimkilic.mongodbhw3.dto.read.ProductCommentReadDto;
import com.asimkilic.mongodbhw3.dto.read.UserReadDto;
import com.asimkilic.mongodbhw3.service.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/productcomments")
public class ProductCommentController {
    @Autowired
    private ProductCommentService productCommentService;

    @GetMapping("")
    public List<ProductCommentReadDto> findAll() {
        return productCommentService.findAll();
    }

    @GetMapping("/{id}")
    public ProductCommentReadDto findById(@PathVariable String id) {
        return productCommentService.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@Valid @RequestBody ProductCommentCreateDto productcommentCreateDto) {

        ProductCommentReadDto productCommentReadDtoReadDto = productCommentService.save(productcommentCreateDto);

        return new ResponseEntity<>(productCommentReadDtoReadDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        productCommentService.deleteById(id);
    }
}
