package com.asimkilic.mongodbhw3.service.entityservice;

import com.asimkilic.mongodbhw3.entity.User;
import com.asimkilic.mongodbhw3.repository.UserRepository;
import com.asimkilic.mongodbhw3.service.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserEntityService {
    @Autowired
    private UserRepository userRepository;



    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        User user = null;

        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            user = optionalUser.get();
        }

        return user;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

}
