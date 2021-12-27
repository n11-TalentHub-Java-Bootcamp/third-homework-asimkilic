package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.converter.UserConverter;
import com.asimkilic.mongodbhw3.dto.create.UserCreateDto;
import com.asimkilic.mongodbhw3.dto.read.UserReadDto;
import com.asimkilic.mongodbhw3.entity.User;
import com.asimkilic.mongodbhw3.service.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.asimkilic.mongodbhw3.converter.UserConverter.INSTANCE;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEntityService userEntityService;

  //  @Autowired
  //  private ProductCommentService productCommentService;


    @Override
    public List<UserReadDto> findAll() {

        List<User> userList = userEntityService.findAll();

        List<UserReadDto> userReadDtoList = INSTANCE.convertUserListToUserReadDtoList(userList);

        return userReadDtoList;

    }

    @Override
    public UserReadDto findById(String id) {

        User user = userEntityService.findById(id);

        UserReadDto userReadDto = INSTANCE.convertUserToUserReadDto(user);

        return userReadDto;

    }

    @Override
    public UserReadDto save(UserCreateDto userCreateDto) {

        User user = INSTANCE.convertUserCreateDtoToUser(userCreateDto);

        user = userEntityService.save(user);

        UserReadDto userReadDto = INSTANCE.convertUserToUserReadDto(user);

        return userReadDto;
    }

    @Override
    public void deleteById(String id) {

       // productCommentService.deleteAllByUserId(id);

        userEntityService.deleteById(id);
    }

    @Override
    public void delete(UserReadDto userReadDto) {

       // productCommentService.deleteAllByUserId(userReadDto.getId());

        userEntityService.deleteById(userReadDto.getId());
    }
}
