package com.twoTeam.groupProject.Service.impl;

import com.twoTeam.groupProject.Service.ifs.UserService;
import com.twoTeam.groupProject.constants.UserRoles;
import com.twoTeam.groupProject.dto.UserRegisterRequest;
import com.twoTeam.groupProject.entity.UsersEntity;
import com.twoTeam.groupProject.exceptions.RegisterParamException;
import com.twoTeam.groupProject.repository.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public UsersEntity register(UserRegisterRequest request) {
        if (userDao.findUsersEntitiesByEmail(request.getEmail()) != null) {
            log.warn("此信箱已被註冊:{}", request.getEmail());
            throw new RegisterParamException("此信箱已被註冊");
        }
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setEmail(request.getEmail());
        usersEntity.setName(request.getName());
        usersEntity.setPassword(request.getPassword());
        usersEntity.setRole(UserRoles.NORMAL);
        return userDao.save(usersEntity);
    }
}
