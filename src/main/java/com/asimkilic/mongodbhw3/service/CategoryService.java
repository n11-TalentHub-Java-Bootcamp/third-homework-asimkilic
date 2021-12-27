package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.dto.create.CategoryCreateDto;
import com.asimkilic.mongodbhw3.dto.read.CategoryReadDto;
import com.asimkilic.mongodbhw3.entity.Category;

import java.util.List;

public interface CategoryService {

    CategoryReadDto save(CategoryCreateDto categoryCreateDto);

    void delete(String id);

    List<CategoryReadDto> findAll();

    CategoryReadDto findById(String id);



}
