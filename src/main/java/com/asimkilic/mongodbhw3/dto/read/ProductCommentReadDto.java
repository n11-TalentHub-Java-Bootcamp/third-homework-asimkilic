package com.asimkilic.mongodbhw3.dto.read;

import java.util.Date;

public class ProductCommentReadDto {
    private String id;

    private String comment;

    private Date commentDate;

    private ProductReadDto product;

    private UserReadDto user;

    public ProductCommentReadDto() {
    }

    public ProductCommentReadDto(String id, String comment, Date commentDate, ProductReadDto product, UserReadDto user) {
        this.id = id;
        this.comment = comment;
        this.commentDate = commentDate;
        this.product = product;
        this.user = user;
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

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public ProductReadDto getProduct() {
        return product;
    }

    public void setProduct(ProductReadDto product) {
        this.product = product;
    }

    public UserReadDto getUser() {
        return user;
    }

    public void setUser(UserReadDto user) {
        this.user = user;
    }
}
