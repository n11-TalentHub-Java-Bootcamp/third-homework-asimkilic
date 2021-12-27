package com.asimkilic.mongodbhw3.controller;


import com.asimkilic.mongodbhw3.dto.create.ProductCreateDto;
import com.asimkilic.mongodbhw3.dto.read.ProductReadDto;
import com.asimkilic.mongodbhw3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public List<ProductReadDto> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductReadDto findById(@PathVariable String id) {
        return productService.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody ProductCreateDto productCreateDto) {

        ProductReadDto productReadDto = productService.save(productCreateDto);

        return new ResponseEntity<>(productReadDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        productService.deleteById(id);
    }

}
