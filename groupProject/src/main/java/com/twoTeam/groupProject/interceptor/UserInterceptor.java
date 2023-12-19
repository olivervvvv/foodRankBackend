package com.twoTeam.groupProject.interceptor;

import com.twoTeam.groupProject.constants.UserRoles;
import com.twoTeam.groupProject.exceptions.UserIdentityException;
import com.twoTeam.groupProject.exceptions.UserValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
@Slf4j
/*
* 只要是涉及到需登入才能使用的功能，都在此攔截驗證身分
* */
public class UserInterceptor implements HandlerInterceptor {

    /*
     * 設計邏輯:前端固定傳送/users/email/**近來，此攔截器會根據把email替換成session裡email的值
     * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        if (session.getAttribute("email") == null) {
            throw new UserIdentityException("您尚未登入");
        }

//        log.info("測試用, sessionId:{}", session.getId());
//        log.info("測試用 email:{}", session.getAttribute("email"));
//        log.info("測試用 role:{}", session.getAttribute("role"));

        return true;
    }


}
