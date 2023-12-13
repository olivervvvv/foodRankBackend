package com.twoTeam.groupProject.Service.ifs;


import com.twoTeam.groupProject.dto.UserLoginRequest;
import com.twoTeam.groupProject.dto.UserRegisterRequest;
import com.twoTeam.groupProject.entity.UsersEntity;

import javax.servlet.http.HttpSession;

public interface UserService {
    UsersEntity register(UserRegisterRequest userRegisterRequest);


    void login(UserLoginRequest userLoginRequest, HttpSession session);
}
