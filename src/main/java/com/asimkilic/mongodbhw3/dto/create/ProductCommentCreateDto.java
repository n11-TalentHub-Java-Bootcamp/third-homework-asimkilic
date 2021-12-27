package com.asimkilic.mongodbhw3.dto.create;


import javax.validation.constraints.Size;

public class ProductCommentCreateDto {
    @Size(max=500)
    private String comment;

    private String productId;

    private String userId;

    public ProductCommentCreateDto() {
    }

    public ProductCommentCreateDto(String comment, String productId, String userId) {
        this.comment = comment;
        this.productId = productId;
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
