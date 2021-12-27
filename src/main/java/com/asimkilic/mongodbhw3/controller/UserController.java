package com.asimkilic.mongodbhw3.controller;


import com.asimkilic.mongodbhw3.dto.create.UserCreateDto;
import com.asimkilic.mongodbhw3.dto.read.UserReadDto;
import com.asimkilic.mongodbhw3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<UserReadDto> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserReadDto findById(@PathVariable String id) {
        return userService.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody UserCreateDto userCreateDto) {

        UserReadDto userReadDto = userService.save(userCreateDto);

        return new ResponseEntity<>(userReadDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        userService.deleteById(id);
    }
}
