package com.asimkilic.mongodbhw3.converter;

import com.asimkilic.mongodbhw3.dto.create.CategoryCreateDto;
import com.asimkilic.mongodbhw3.dto.read.CategoryReadDto;
import com.asimkilic.mongodbhw3.dto.update.CategoryUpdateDto;
import com.asimkilic.mongodbhw3.entity.Category;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryConverter {

    CategoryConverter INSTANCE = Mappers.getMapper(CategoryConverter.class);



    Category convertCategoryCreateDtoToCategory(CategoryCreateDto categoryCreateDto);
    List<Category> convertCategoryCreateDtoListToCategoryList(List<CategoryCreateDto> categoryCreateDtoList);



    @Mapping(target = "superCategoryId", source = "superCategory.id")
    @Mapping(target = "name", source = "categoryName")
    Category convertCategoryReadDtoToCategory(CategoryReadDto categoryReadDto);

    @Mapping(target = "superCategoryId", source = "superCategory.id")
    @Mapping(target = "name", source = "categoryName")
    List<Category> convertCategoryReadDtoListToCategoryList(List<CategoryReadDto> categoryReadDtoList);



    @Mapping(target = "name", source = "categoryName")
    Category convertCategoryUpdateDtoToCategory(CategoryUpdateDto categoryUpdateDto);
    @Mapping(target = "name", source = "categoryName")
    List<Category> convertCategoryUpdateDtoListToCategoryList(List<CategoryUpdateDto> categoryUpdateDtoList);



    CategoryCreateDto convertCategoryToCategoryCreateDto(Category category);
    List<CategoryCreateDto> convertCategoryListToCategoryCreateDtoList(List<Category> categoryList);



    @Mapping(target = "categoryName", source = "name")
    CategoryUpdateDto convertCategoryToCategoryUpdateDto(Category category);

    @Mapping(target = "categoryName", source = "name")
    List<CategoryUpdateDto> convertCategoryListToCategoryUpdateDtoList(List<Category> categoryList);


    @Mapping(target="categoryName",source = "name")
    @Mapping(target="superCategory.id",source = "superCategoryId")
    CategoryReadDto convertCategoryToCategoryReadDto(Category category);

    @Mapping(target="categoryName",source = "name")
    @Mapping(target="superCategory.id",source = "superCategoryId")
    List<CategoryReadDto> convertCategoryListToCategoryReadDtoList(List<Category> categoryList);

    @AfterMapping
    default void setSuperCategory(@MappingTarget final CategoryReadDto categoryReadDto, Category category) {
        if (category.getSuperCategoryId() == null) {
            categoryReadDto.setSuperCategory(null);
        }
    }

}
