package com.asimkilic.mongodbhw3.dto.read;

public class CategoryReadDto {
    private String id;
    private String categoryName;
    private Long level;
    private CategoryReadDto superCategory;

    public CategoryReadDto() {
    }

    public CategoryReadDto(String id, String categoryName, Long level, CategoryReadDto superCategory) {
        this.id = id;
        this.categoryName = categoryName;
        this.level = level;
        this.superCategory = superCategory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public CategoryReadDto getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(CategoryReadDto superCategory) {
        this.superCategory = superCategory;
    }
}
