package com.twoTeam.groupProject.controller;

import com.twoTeam.groupProject.Service.ifs.UserService;
import com.twoTeam.groupProject.dto.UserLoginRequest;
import com.twoTeam.groupProject.dto.UserRegisterRequest;
import com.twoTeam.groupProject.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    public ResponseEntity<UsersEntity> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        UsersEntity usersEntity = userService.register(userRegisterRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(usersEntity);
    }
//    @PostMapping("/users/login")
//    public ResponseEntity<UsersEntity> login(@RequestBody @Valid UserLoginRequest userLoginRequest) {
//        UsersEntity usersEntity = userService.login(userLoginRequest);
//        return ResponseEntity.status(HttpStatus.CREATED).body(usersEntity);
//    }

}
