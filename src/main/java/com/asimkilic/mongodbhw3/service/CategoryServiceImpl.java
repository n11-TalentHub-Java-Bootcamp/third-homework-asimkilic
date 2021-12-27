package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.converter.CategoryConverter;
import com.asimkilic.mongodbhw3.dto.create.CategoryCreateDto;
import com.asimkilic.mongodbhw3.dto.read.CategoryReadDto;
import com.asimkilic.mongodbhw3.entity.Category;
import com.asimkilic.mongodbhw3.service.entityservice.CategoryEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.asimkilic.mongodbhw3.converter.CategoryConverter.INSTANCE;

@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryEntityService categoryEntityService;

    @Override
    public CategoryReadDto save(CategoryCreateDto categoryCreateDto) {

        Category category = INSTANCE.convertCategoryCreateDtoToCategory(categoryCreateDto);

        category = categoryEntityService.save(category);

        CategoryReadDto categoryReadDto = INSTANCE.convertCategoryToCategoryReadDto(category);

        return categoryReadDto;
    }

    @Override
    public void delete(String id) {
        categoryEntityService.deleteById(id);
    }

    @Override
    public List<CategoryReadDto> findAll() {

        List<Category> categoryList = categoryEntityService.findAll();

        List<CategoryReadDto> categoryReadDtoList = INSTANCE.convertCategoryListToCategoryReadDtoList(categoryList);

        return categoryReadDtoList;
    }

    @Override
    public CategoryReadDto findById(String id) {

        Category category = categoryEntityService.findById(id);
        Category superCategory = categoryEntityService.findById(category.getSuperCategoryId());

        CategoryReadDto categoryReadDto = INSTANCE.convertCategoryToCategoryReadDto(category);
        CategoryReadDto superCategoryReadDto = INSTANCE.convertCategoryToCategoryReadDto(superCategory);

        categoryReadDto.setSuperCategory(superCategoryReadDto);

        return categoryReadDto;
    }
}
