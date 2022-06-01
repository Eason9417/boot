package com.baiyun.boot.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //设置登录拦截器，用户未登录时不允许访问主页并转发到登录页面
        HttpSession session = request.getSession();
        Object student = session.getAttribute("studentId");
        if (student != null){
            return true;
        }
        request.setAttribute("msg","请重新登录!!");
        request.getRequestDispatcher("/login").forward(request,response);
        return false;
    }
}
