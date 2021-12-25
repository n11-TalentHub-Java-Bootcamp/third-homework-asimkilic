package com.asimkilic.mongodbhw3.service;

import com.asimkilic.mongodbhw3.entity.User;
import com.asimkilic.mongodbhw3.service.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEntityService userEntityService;

    @Autowired
    private ProductCommentService productCommentService;


    @Override
    public List<User> findAll() {
        return userEntityService.findAll();
    }

    @Override
    public User findById(String id) {
        return userEntityService.findById(id);
    }

    @Override
    public User save(User user) {
        return userEntityService.save(user);
    }

    @Override
    public void deleteById(String id) {
        productCommentService.deleteAllByUserId(id);
        userEntityService.deleteById(id);
    }

    @Override
    public void delete(User user) {
        productCommentService.deleteAllByUserId(user.getId());
        userEntityService.delete(user);
    }
}
