package com.asimkilic.mongodbhw3.dto.create;

public class CategoryCreateDto {
    private String name;
    private Long level;
    private String superCategoryId;

    public CategoryCreateDto() {
    }

    public CategoryCreateDto(String categoryName, Long level, String superCategoryId) {
        this.name = categoryName;
        this.level = level;
        this.superCategoryId = superCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getSuperCategoryId() {
        return superCategoryId;
    }

    public void setSuperCategoryId(String superCategoryId) {
        this.superCategoryId = superCategoryId;
    }
}
