package com.asimkilic.mongodbhw3.dto.read;

import java.math.BigDecimal;
import java.util.Date;

public class ProductReadDto {
    private String id;

    private String name;

    private BigDecimal price;

    private Date createDate;

    private CategoryReadDto category;

    public ProductReadDto() {
    }

    public ProductReadDto(String id, String name, BigDecimal price, Date createDate, CategoryReadDto category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createDate = createDate;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public CategoryReadDto getCategory() {
        return category;
    }

    public void setCategory(CategoryReadDto category) {
        this.category = category;
    }
}
