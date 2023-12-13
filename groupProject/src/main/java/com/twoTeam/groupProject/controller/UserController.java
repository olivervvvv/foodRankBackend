package com.twoTeam.groupProject.controller;

import com.twoTeam.groupProject.Service.ifs.UserService;
import com.twoTeam.groupProject.dto.UserLoginRequest;
import com.twoTeam.groupProject.dto.UserRegisterRequest;
import com.twoTeam.groupProject.entity.UsersEntity;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/users/register")
    public ResponseEntity<UsersEntity> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        UsersEntity usersEntity = userService.register(userRegisterRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(usersEntity);
    }
    @PostMapping(value = "/users/login")
    @ApiOperation(value = "登入")
    public ResponseEntity<?> login(@RequestBody @Valid UserLoginRequest userLoginRequest,
                                             HttpSession session) {
        log.info("login 測試用, sessionId:{}", session.getId());
        userService.login(userLoginRequest, session);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(value = "/users/logout")
    @ApiOperation(value = "登出")
    public ResponseEntity<?> logout(HttpSession session) {
        log.info("logout 測試用, sessionId:{}", session.getId());
        log.info("logout 操作執行");
        session.removeAttribute("email");
        session.removeAttribute("role");
        log.info("確認是否刪除, email:{}, role:{}", session.getAttribute("email"), session.getAttribute("role"));
        session.invalidate();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
