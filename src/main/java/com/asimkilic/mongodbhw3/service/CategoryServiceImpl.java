package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.entity.Category;
import com.asimkilic.mongodbhw3.service.entityservice.CategoryEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryEntityService categoryEntityService;

    @Override
    public Category save(Category category) {
        return categoryEntityService.save(category);
    }

    @Override
    public void delete(String id) {
        categoryEntityService.deleteById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryEntityService.findAll();
    }

    @Override
    public Category findById(String id) {
        return categoryEntityService.findById(id);
    }
}
