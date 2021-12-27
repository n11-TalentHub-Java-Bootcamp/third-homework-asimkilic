package com.asimkilic.mongodbhw3.converter;

import com.asimkilic.mongodbhw3.dto.create.UserCreateDto;
import com.asimkilic.mongodbhw3.dto.read.UserReadDto;
import com.asimkilic.mongodbhw3.dto.update.UserUpdateDto;
import com.asimkilic.mongodbhw3.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User convertUserCreateDtoToUser(UserCreateDto userCreateDto);

    List<User> convertUserCreateDtoListToUserList(List<UserCreateDto> userCreateDtoList);

    User convertUserUpdateDtoToUser(UserUpdateDto userUpdateDto);

    List<User> convertUserUpdateDtoListToUserList(List<UserUpdateDto> userUpdateDtoList);

    User convertUserReadDtoToUser(UserReadDto userReadDto);

    List<User> convertUserReadDtoListToUserList(List<UserReadDto> userReadDtoList);


    UserReadDto convertUserToUserReadDto(User user);
    List<UserReadDto> convertUserListToUserReadDtoList(List<User> userList);

    UserCreateDto convertUserToUserCreateDto(User user);
    List<UserCreateDto> convertUserListToUserCreateDtoList(List<User> userList);

    UserUpdateDto convertUserToUserUpdateDto(User user);
    List<UserUpdateDto> convertUserListToUserUpdateDtoList(List<User> userList);



}
