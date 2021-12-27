package com.asimkilic.mongodbhw3.converter;

import com.asimkilic.mongodbhw3.dto.ProductDetailDto;
import com.asimkilic.mongodbhw3.dto.create.ProductCreateDto;
import com.asimkilic.mongodbhw3.dto.read.ProductReadDto;
import com.asimkilic.mongodbhw3.dto.update.ProductUpdateDto;
import com.asimkilic.mongodbhw3.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductConverter {

    ProductConverter INSTANCE = Mappers.getMapper(ProductConverter.class);

    @Mapping(target = "createDate", expression = "java(new java.util.Date())")
    Product convertProductCreateDtoToProduct(ProductCreateDto productCreateDto);

    @Mapping(target = "createDate", expression = "java(new java.util.Date())")
    List<Product> convertProductCreateDtoListToProductList(List<ProductCreateDto> productCreateDtoList);


    Product convertProductUpdateDtoToProduct(ProductUpdateDto productUpdateDto);

    List<Product> convertProductUpdateDtoListToProductList(List<ProductUpdateDto> productUpdateDtoList);


    @Mapping(target = "categoryId", source = "category.id")
    Product convertProductReadDtoToProduct(ProductReadDto productReadDto);

    @Mapping(target = "categoryId", source = "category.id")
    List<Product> convertProductReadDtoListToProductList(List<ProductReadDto> productReadDtoList);


    ProductCreateDto convertProductToProductCreateDto(Product product);

    List<ProductCreateDto> convertProductListToProductCreateDtoList(List<Product> productList);


    ProductUpdateDto convertProductToProductUpdateDto(Product product);

    List<ProductUpdateDto> convertProductListToProductUpdateDtoList(List<Product> productList);

    @Mapping(target = "category.id",source = "categoryId")
    ProductReadDto convertProductToProductReadDto(Product product);

    @Mapping(target = "category.id",source = "categoryId")
    List<ProductReadDto> convertProductListToProductReadDtoList(List<Product> productList);

    @Mapping(target = "productName", source = "name")
    @Mapping(target = "productPrice", source = "price")
    ProductDetailDto convertProductToProductDetailDto(Product product);

    @Mapping(target = "productName", source = "name")
    @Mapping(target = "productPrice", source = "price")
    List<ProductDetailDto> convertAllProductListToProductDetailDtoList(List<Product> product);


}
