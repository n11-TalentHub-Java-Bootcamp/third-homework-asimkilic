package com.asimkilic.mongodbhw3.service;


import com.asimkilic.mongodbhw3.dto.create.UserCreateDto;
import com.asimkilic.mongodbhw3.dto.read.UserReadDto;
import com.asimkilic.mongodbhw3.entity.User;

import java.util.List;

public interface UserService {
    List<UserReadDto> findAll();

    UserReadDto findById(String id);

    UserReadDto save(UserCreateDto userCreateDto);

    void deleteById(String id);

    void delete(UserReadDto userReadDto);
}
