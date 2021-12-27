package com.asimkilic.mongodbhw3.controller;

import com.asimkilic.mongodbhw3.dto.create.CategoryCreateDto;
import com.asimkilic.mongodbhw3.dto.read.CategoryReadDto;
import com.asimkilic.mongodbhw3.entity.Category;
import com.asimkilic.mongodbhw3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public List<CategoryReadDto> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public CategoryReadDto findById(@PathVariable String id) {
        return categoryService.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody CategoryCreateDto categoryCreateDto) {

        CategoryReadDto categoryReadDto = categoryService.save(categoryCreateDto);

        return new ResponseEntity<>(categoryReadDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        categoryService.delete(id);
    }

}
