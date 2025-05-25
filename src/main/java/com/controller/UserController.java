package com.controller;

import com.dto.CustomException;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;


    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> allUsers = userService.getAllUsers();

        if (allUsers.isEmpty()){
            throw new CustomException( "No User found", "No_Content", 500);
        }else {
            return new ResponseEntity<>(allUsers, HttpStatus.OK);
        }
    }

}
