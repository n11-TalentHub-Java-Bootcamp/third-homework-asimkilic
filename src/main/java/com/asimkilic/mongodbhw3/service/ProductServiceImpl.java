package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.dto.ProductDetailDto;
import com.asimkilic.mongodbhw3.dto.create.ProductCreateDto;
import com.asimkilic.mongodbhw3.dto.read.CategoryReadDto;
import com.asimkilic.mongodbhw3.dto.read.ProductReadDto;

import com.asimkilic.mongodbhw3.entity.Product;
import com.asimkilic.mongodbhw3.service.entityservice.ProductEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.asimkilic.mongodbhw3.converter.ProductConverter.INSTANCE;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductEntityService productEntityService;

    @Autowired
    private CategoryService categoryService;

    @Override
    public List<ProductReadDto> findAll() {
        List<Product> productList = productEntityService.findAll();

        List<ProductReadDto> productReadDtoList = INSTANCE.convertProductListToProductReadDtoList(productList);

        return productReadDtoList;
    }

    @Override
    public ProductReadDto findById(String id) {
        Product product = productEntityService.findById(id);
        ProductReadDto productReadDto = INSTANCE.convertProductToProductReadDto(product);

        CategoryReadDto productCategoryReadDto = categoryService.findById(product.getCategoryId());
        productReadDto.setCategory(productCategoryReadDto);

        return productReadDto;
    }

    @Override
    public ProductDetailDto findProductDetailDtoById(String id) {
        Product product = productEntityService.findById(id);

        ProductDetailDto productDetailDto = INSTANCE.convertProductToProductDetailDto(product);

        return productDetailDto;
    }

    @Override
    public ProductReadDto save(ProductCreateDto productCreateDto) {
        Product product = INSTANCE.convertProductCreateDtoToProduct(productCreateDto);

        product = productEntityService.save(product);

        ProductReadDto productReadDto = INSTANCE.convertProductToProductReadDto(product);

        return productReadDto;
    }

    @Override
    public void deleteById(String id) {
        productEntityService.deleteById(id);
    }

    @Override
    public List<ProductDetailDto> findAllProductByCategoryId(String categoryId) {
        List<Product> productList = productEntityService.findAllProductByCategoryId(categoryId);

        List<ProductDetailDto> productDetailDtoList = INSTANCE.convertAllProductListToProductDetailDtoList(productList);

        return productDetailDtoList;
    }
}
