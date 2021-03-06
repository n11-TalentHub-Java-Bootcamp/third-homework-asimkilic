package com.asimkilic.mongodbhw3.dto.update;

public class CategoryUpdateDto {
    private String id;
    private String categoryName;
    private Long level;
    private String superCategoryId;

    public CategoryUpdateDto() {
    }

    public CategoryUpdateDto(String id, String categoryName, Long level, String superCategoryId) {
        this.id = id;
        this.categoryName = categoryName;
        this.level = level;
        this.superCategoryId = superCategoryId;
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

    public String getSuperCategoryId() {
        return superCategoryId;
    }

    public void setSuperCategoryId(String superCategoryId) {
        this.superCategoryId = superCategoryId;
    }
}
