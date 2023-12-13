package com.twoTeam.groupProject.Service.ifs;


import com.twoTeam.groupProject.dto.UserRegisterRequest;
import com.twoTeam.groupProject.entity.UsersEntity;

public interface UserService {
    UsersEntity register(UserRegisterRequest userRegisterRequest);
}
