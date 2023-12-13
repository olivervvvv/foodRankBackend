package com.twoTeam.groupProject.controller;

import com.twoTeam.groupProject.dto.UserRegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @PostMapping("/users/register")
    public String register(UserRegisterRequest userRegisterRequest) {


    }
    @PostMapping("/users/login")
    public String register(UserRegisterRequest userRegisterRequest,
                           HttpSession session) {
        // 判斷登入成功

        //登入成功後
        session.setAttribute("email");
        session.setAttribute("role");
    }
}
