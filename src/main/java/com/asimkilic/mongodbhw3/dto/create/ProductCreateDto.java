package com.asimkilic.mongodbhw3.dto.create;

import java.math.BigDecimal;

public class ProductCreateDto {

    private String name;

    private BigDecimal price;

    private String categoryId;

    public ProductCreateDto() {
    }

    public ProductCreateDto(String name, BigDecimal price, String categoryId) {
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
