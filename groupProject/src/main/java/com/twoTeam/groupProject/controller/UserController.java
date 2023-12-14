package com.twoTeam.groupProject.controller;

import com.twoTeam.groupProject.Service.ifs.UserService;
import com.twoTeam.groupProject.constants.UserRoles;
import com.twoTeam.groupProject.dto.UserLoginRequest;
import com.twoTeam.groupProject.dto.UserRegisterRequest;
import com.twoTeam.groupProject.entity.UsersEntity;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //或許可以設計成登入後，返回權限給前端，讓前端可以把權限加入request header，雖然這樣會使得session超時後，
    // 前端依然保有權限，但此時沒有email了，勢必要重新登入，而重新登入便會刷新權限
    @PostMapping(value = "/users/login")
    @ApiOperation(value = "登入")
    public ResponseEntity<String> login(@RequestBody @Valid UserLoginRequest userLoginRequest,
                                   HttpSession session) {
        log.info("login 測試用, sessionId:{}", session.getId());
        UserRoles userRoles = userService.login(userLoginRequest, session);
        // 暫時先不 return role 給前端，還沒想到實際用途或符合的設計
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


    /*
    *原本預計把 url 設計為 "/users/{email}/comments"，代表者某個特定用戶的留言功能
    *但如此設計的話會喪失 RESTful API 對於資源的定義，因此改 currentUser 代替，看來應該是比較合理的
    * Bing AI 建議的。
    * 此方法為測試用方法，預計只要是需登入才能使用的功能，url就設計為 /users/**，再透過UserInterceptor去判斷是否登入
    * 對於權限的驗證也是從session裡 get role 出來做驗證
     */

    @GetMapping(value = "/users/currentUser/comments123")
    public ResponseEntity<?> comments123(HttpSession session) {
        String email = (String) session.getAttribute("email");
        log.info("comments123 API 執行, email:{}", email);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
