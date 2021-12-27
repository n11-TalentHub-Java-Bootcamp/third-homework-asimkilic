package com.asimkilic.mongodbhw3.converter;

import com.asimkilic.mongodbhw3.dto.create.ProductCommentCreateDto;
import com.asimkilic.mongodbhw3.dto.read.ProductCommentReadDto;
import com.asimkilic.mongodbhw3.dto.update.ProductCommentUpdateDto;
import com.asimkilic.mongodbhw3.entity.ProductComment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductCommentConverter {

    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);

    @Mapping(target = "commentDate", expression = "java(new java.util.Date())")
    ProductComment convertProductCommentCreateDtoToProductComment(ProductCommentCreateDto productCommentCreateDto);

    @Mapping(target = "commentDate", expression = "java(new java.util.Date())")
    List<ProductComment> convertProductCommentCreateDtoListToProductCommentList(List<ProductCommentCreateDto> productCommentCreateDtoList);


    ProductComment convertProductCommentUpdateDtoToProductComment(ProductCommentUpdateDto productCommentUpdateDto);

    List<ProductComment> convertProductCommentUpdateDtoListToProductCommentList(List<ProductCommentUpdateDto> productCommentUpdateDtoList);


    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "userId", source = "user.id")
    ProductComment convertProductCommentReadDtoToProductComment(ProductCommentReadDto productCommentReadDto);

    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "userId", source = "user.id")
    List<ProductComment> convertProductCommentReadDtoListToProductCommentList(List<ProductCommentReadDto> productCommentReadDtoList);


    ProductCommentUpdateDto convertProductCommentToProductCommentUpdateDto(ProductComment productComment);

    List<ProductCommentUpdateDto> convertProductCommentListToProductCommentUpdateDtoList(List<ProductComment> productCommentList);


    ProductCommentCreateDto convertProductCommentToProductCommentCreateDto(ProductComment productComment);

    List<ProductCommentCreateDto> convertProductCommentListToProductCommentCreateDtoList(List<ProductComment> productCommentList);

    @Mapping(target = "product.id", source = "productId")
    @Mapping(target = "user.id", source = "userId")
    ProductCommentReadDto convertProductCommentToProductCommentReadDto(ProductComment productComment);

    @Mapping(target = "product.id", source = "productId")
    @Mapping(target = "user.id", source = "userId")
    List<ProductCommentReadDto> convertProductCommentListToProductCommentReadDtoList(List<ProductComment> productCommentList);

}
