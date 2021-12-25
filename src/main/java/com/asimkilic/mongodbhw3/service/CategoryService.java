package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.entity.Category;

import java.util.List;

public interface CategoryService {

    Category save(Category category);

    void delete(String id);


    List<Category> findAll();

    Category findById(String id);

}
