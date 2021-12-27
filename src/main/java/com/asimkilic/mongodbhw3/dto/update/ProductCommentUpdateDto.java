package com.asimkilic.mongodbhw3.dto.update;


import javax.validation.constraints.Size;

public class ProductCommentUpdateDto {
    private String id;
    @Size(max=500)
    private String comment;

    private String productId;

    private String userId;

    public ProductCommentUpdateDto() {
    }

    public ProductCommentUpdateDto(String id, String comment, String productId, String userId) {
        this.id = id;
        this.comment = comment;
        this.productId = productId;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
